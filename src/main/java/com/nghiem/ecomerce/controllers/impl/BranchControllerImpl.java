package com.nghiem.ecomerce.controllers.impl;

import com.nghiem.ecomerce.controllers.genericController.impl.ControllerGenericImpl;
import com.nghiem.ecomerce.models.products.Branch;
import com.nghiem.ecomerce.payload.branch.BranchCreate;
import com.nghiem.ecomerce.payload.branch.BranchUpdate;
import com.nghiem.ecomerce.payload.branch.BranchView;
import com.nghiem.ecomerce.services.genericService.ServiceGeneric;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "/api/public/branch")
public class BranchControllerImpl
        extends ControllerGenericImpl<Branch, BranchView, BranchCreate, BranchUpdate> {
    public BranchControllerImpl(ModelMapper mapper, ServiceGeneric<Branch> genericService) {
        super(mapper, genericService);
        this.ViewEntity = BranchView.class;
        this.InsertEntity = BranchCreate.class;
        this.Entity = Branch.class;
        this.UpdateEntity = BranchUpdate.class;

    }
}
