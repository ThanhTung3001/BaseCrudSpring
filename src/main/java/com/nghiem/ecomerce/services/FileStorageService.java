package com.nghiem.ecomerce.services;

import com.nghiem.ecomerce.models.attachments.FileEntity;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FileStorageService {
    public FileEntity storeFile(MultipartFile file);
    public Resource loadFileAsResource(String fileName);
}
