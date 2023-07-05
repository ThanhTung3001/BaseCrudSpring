package com.nghiem.ecomerce.services.genericService;

import com.nghiem.ecomerce.models.BaseEntity;

import java.util.List;
import java.util.UUID;

public interface ServiceGeneric<T extends BaseEntity>  {

    List<T> findAll() throws Exception;
    T save(T entity) throws Exception;
    void delete(UUID id) throws Exception;

}
