package com.nghiem.ecomerce.controllers.impl;

import com.nghiem.ecomerce.controllers.genericController.impl.ControllerGenericImpl;
import com.nghiem.ecomerce.models.banners.Banner;
import com.nghiem.ecomerce.payload.banner.BannerCreate;
import com.nghiem.ecomerce.payload.banner.BannerUpdate;
import com.nghiem.ecomerce.payload.banner.BannerView;
import com.nghiem.ecomerce.services.genericService.ServiceGeneric;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/public/banner")
public class BannerController extends ControllerGenericImpl<Banner, BannerView, BannerCreate, BannerUpdate> {
    public BannerController(ModelMapper mapper, ServiceGeneric<Banner> genericService) {
        super(mapper, genericService);
        this.ViewEntity = BannerView.class;
        this.InsertEntity = BannerCreate.class;
        this.Entity = Banner.class;
        this.UpdateEntity = BannerUpdate.class;
    }
}
