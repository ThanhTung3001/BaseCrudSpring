package com.nghiem.ecomerce.controllers.impl;

import com.nghiem.ecomerce.controllers.genericController.impl.ControllerGenericImpl;
import com.nghiem.ecomerce.models.products.Comment;
import com.nghiem.ecomerce.payload.comments.CommentCreate;
import com.nghiem.ecomerce.payload.comments.CommentUpdate;
import com.nghiem.ecomerce.payload.comments.CommentView;
import com.nghiem.ecomerce.services.genericService.ServiceGeneric;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/public/comment")
public class CommentController extends ControllerGenericImpl<Comment, CommentView, CommentCreate, CommentUpdate> {
    public CommentController(ModelMapper mapper, ServiceGeneric<Comment> genericService) {
        super(mapper, genericService);
        this.ViewEntity = CommentView.class;
        this.InsertEntity = CommentCreate.class;
        this.Entity = Comment.class;
        this.UpdateEntity = CommentUpdate.class;
    }
}
