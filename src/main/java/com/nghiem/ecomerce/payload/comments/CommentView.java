package com.nghiem.ecomerce.payload.comments;

import com.nghiem.ecomerce.payload.BaseViewEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class CommentView extends BaseViewEntity {
    private String text;
    private LocalDateTime date;
}
