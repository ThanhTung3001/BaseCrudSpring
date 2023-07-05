package com.nghiem.ecomerce.repository.genericRepo;

import com.nghiem.ecomerce.models.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GenericRepository<T extends BaseEntity> extends JpaRepository<T, UUID> {

}
