package com.nghiem.ecomerce.payload.comments;

import com.nghiem.ecomerce.payload.BaseUpdateEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class CommentUpdate extends BaseUpdateEntity {
    private String text;
    private LocalDateTime date;
}
