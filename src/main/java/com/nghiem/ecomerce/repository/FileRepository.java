package com.nghiem.ecomerce.repository;

import com.nghiem.ecomerce.models.attachments.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {}