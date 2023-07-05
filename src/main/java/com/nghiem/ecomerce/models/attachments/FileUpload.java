package com.nghiem.ecomerce.models.attachments;

import com.nghiem.ecomerce.models.BaseEntity;
import com.nghiem.ecomerce.models.products.Vehicle;
import jakarta.persistence.*;

@Table(name = "file_upload")
@Entity
public class FileUpload extends BaseEntity {
    public String fileName ;

    public String path ;

    public String severPath;

    public FileType fileType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;


}