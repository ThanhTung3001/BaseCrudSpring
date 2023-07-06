package com.nghiem.ecomerce.controllers.genericController.impl;

import com.nghiem.ecomerce.controllers.genericController.ControllerGeneric;
import com.nghiem.ecomerce.models.BaseEntity;
import com.nghiem.ecomerce.services.genericService.ServiceGeneric;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@SuppressWarnings({"unchecked", "rawtypes"})
@ResponseBody
public class ControllerGenericImpl<T extends BaseEntity, ViewEntity, InsertEntity, UpdateEntity> implements ControllerGeneric<T> {

    private final ModelMapper mapper;

    private final ServiceGeneric<T> genericService;

    protected Class<ViewEntity> ViewEntity;

    protected Class<InsertEntity> InsertEntity;

    protected Class<UpdateEntity> UpdateEntity;

    public ControllerGenericImpl(ModelMapper mapper, ServiceGeneric<T> genericService) {
        this.mapper = mapper;
        this.genericService = genericService;

    }

    @Override
    @PostMapping
    public ResponseEntity<Object> save(T entity) {
        try {
            return new ResponseEntity(genericService.save(entity), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("Erro ao salvar!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @GetMapping
    public ResponseEntity<T> findAll() {
        try {
            List<T>entities = genericService.findAll();
            List<ViewEntity> viewEntities = entities.stream()
                    .map(entity -> mapper.map(entity, ViewEntity))
                    .collect(Collectors.toList());
            return new ResponseEntity(viewEntities, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("Get data fail!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") UUID id) {
        try {
            genericService.delete(id);
            return new ResponseEntity("Sucesso ao apagar!", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("Erro ao apagar!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
