package com.example.msingressrelations.mapper;

import com.example.msingressrelations.dao.entity.PostDetailEntity;
import com.example.msingressrelations.dao.entity.PostEntity;

public class PostDetailMapper {
    public static PostDetailEntity buildPostDetailEntity(PostEntity post,String createdBy){
        return PostDetailEntity.builder()
                .post(post)
                .createdBy(createdBy)
                .build();
    }
}
