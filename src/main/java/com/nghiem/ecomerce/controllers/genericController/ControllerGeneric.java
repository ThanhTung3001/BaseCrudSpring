package com.nghiem.ecomerce.controllers.genericController;

import com.nghiem.ecomerce.models.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

public interface ControllerGeneric <T extends BaseEntity> {
    public ResponseEntity<Object> save(T entity) ;
    public ResponseEntity<T> findAll();
    public ResponseEntity<String> delete(@PathVariable("id") UUID id);
}
