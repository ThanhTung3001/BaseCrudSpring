package com.nghiem.ecomerce.models.attachments;

import com.nghiem.ecomerce.models.BaseEntity;
import com.nghiem.ecomerce.models.products.Vehicle;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Table(name = "file_upload")
@Entity
public class FileEntity extends BaseEntity {
    @Column(nullable = false)
    private String fileName;

    @Column(nullable = false)
    private String fileUrl;

    public FileEntity() {}

    public FileEntity(String fileName, String fileUrl) {
        this.fileName = fileName;
        this.fileUrl = fileUrl;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;


}