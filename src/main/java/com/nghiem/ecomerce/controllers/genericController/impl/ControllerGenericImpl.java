package com.nghiem.ecomerce.controllers.genericController.impl;

import com.nghiem.ecomerce.controllers.genericController.ControllerGeneric;
import com.nghiem.ecomerce.models.BaseEntity;
import com.nghiem.ecomerce.services.genericService.ServiceGeneric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@SuppressWarnings({ "unchecked", "rawtypes" })
@ResponseBody
public class ControllerGenericImpl<T extends BaseEntity> implements ControllerGeneric<T> {

    @Autowired
    private ServiceGeneric<T> genericService;

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
            return new ResponseEntity(genericService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("Erro ao buscar todos!", HttpStatus.INTERNAL_SERVER_ERROR);
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
