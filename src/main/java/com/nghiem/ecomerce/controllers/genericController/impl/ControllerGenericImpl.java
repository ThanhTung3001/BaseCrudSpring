package com.nghiem.ecomerce.controllers.genericController.impl;

import com.nghiem.ecomerce.controllers.genericController.ControllerGeneric;
import com.nghiem.ecomerce.models.BaseEntity;
import com.nghiem.ecomerce.payload.response.MessageResponse;
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
public class ControllerGenericImpl<T extends BaseEntity, ViewEntity, InsertEntity, UpdateEntity> {

    private final ModelMapper mapper;

    private final ServiceGeneric<T> genericService;

    protected Class<ViewEntity> ViewEntity;

    protected Class<InsertEntity> InsertEntity;

    protected Class<UpdateEntity> UpdateEntity;

    protected Class<T> Entity;

    public ControllerGenericImpl(ModelMapper mapper, ServiceGeneric<T> genericService) {
        this.mapper = mapper;
        this.genericService = genericService;

    }

    @PostMapping
    public ResponseEntity<Object> save(InsertEntity insertEntity) {
        try {
            T entity = mapper.map(insertEntity, Entity);
            return new ResponseEntity(genericService.save(entity), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(new MessageResponse("Save data success"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<T> findAll() {
        try {
            List<T> entities = genericService.findAll();
            List<ViewEntity> viewEntities = entities.stream()
                    .map(entity -> mapper.map(entity, ViewEntity))
                    .collect(Collectors.toList());
            return new ResponseEntity(viewEntities, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(new MessageResponse("Get data fail"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") UUID id) {
        try {
            genericService.delete(id);
            return new ResponseEntity(new MessageResponse("Delete data success"), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(new MessageResponse("Delete data Fail"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> Update(@PathVariable("id") UUID id, @RequestBody UpdateEntity updateEntity) {
        try {
            T entity  = mapper.map(updateEntity,Entity);
            entity.setId(id);
            genericService.save(entity);
            return new ResponseEntity(new MessageResponse("Update data success"), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(new MessageResponse("Delete data Fail"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
