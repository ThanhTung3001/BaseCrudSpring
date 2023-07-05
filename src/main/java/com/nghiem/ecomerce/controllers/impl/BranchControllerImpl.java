package com.nghiem.ecomerce.controllers.impl;

import com.nghiem.ecomerce.controllers.BranchController;
import com.nghiem.ecomerce.controllers.genericController.impl.ControllerGenericImpl;
import com.nghiem.ecomerce.models.products.Branch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/public/branch")
public class BranchControllerImpl extends ControllerGenericImpl<Branch> implements BranchController {

}
