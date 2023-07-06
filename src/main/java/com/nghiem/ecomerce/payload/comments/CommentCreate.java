package com.nghiem.ecomerce.payload.comments;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Setter
@Getter
public class CommentCreate {
    private String text;
    private LocalDateTime date;
}
