package com.nghiem.ecomerce.services.genericService.impl;

import com.nghiem.ecomerce.models.BaseEntity;
import com.nghiem.ecomerce.repository.genericRepo.GenericRepository;
import com.nghiem.ecomerce.services.genericService.ServiceGeneric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ServiceGenericImpl<T extends BaseEntity> implements ServiceGeneric<T> {

    @Autowired
    protected GenericRepository<T> genericRepository;

    @Override
    public List<T> findAll() throws Exception {
        try {
            return genericRepository.findAll();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public T save(T entity) throws Exception {
        try {
            return genericRepository.save(entity);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void delete(UUID id) throws Exception {
        try {
            genericRepository.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }

}
