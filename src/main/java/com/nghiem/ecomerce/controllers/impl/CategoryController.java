package com.nghiem.ecomerce.controllers.impl;

import com.nghiem.ecomerce.controllers.genericController.impl.ControllerGenericImpl;
import com.nghiem.ecomerce.models.products.CategoryVehicle;
import com.nghiem.ecomerce.payload.category.CategoryCreate;
import com.nghiem.ecomerce.payload.category.CategoryUpdate;
import com.nghiem.ecomerce.payload.category.CategoryView;
import com.nghiem.ecomerce.services.genericService.ServiceGeneric;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/public/category")

public class CategoryController extends ControllerGenericImpl<CategoryVehicle, CategoryView, CategoryCreate, CategoryUpdate> {
    public CategoryController(ModelMapper mapper, ServiceGeneric<CategoryVehicle> genericService) {
        super(mapper, genericService);
        this.ViewEntity = CategoryView.class;
        this.InsertEntity = CategoryCreate.class;
        this.Entity = CategoryVehicle.class;
        this.UpdateEntity = CategoryUpdate.class;

    }
}
