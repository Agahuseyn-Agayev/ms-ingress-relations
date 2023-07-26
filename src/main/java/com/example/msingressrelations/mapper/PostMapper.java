package com.example.msingressrelations.mapper;

import com.example.msingressrelations.dao.entity.PostEntity;
import com.example.msingressrelations.model.dto.PostDto;
import com.example.msingressrelations.model.dto.SavePostDto;

public class PostMapper {
//    public static PostDto mapEntityToDto(PostEntity entity){
//        return new PostDto(entity.getId(),entity.getTittle());
//    }

    public static PostEntity buildPostEntity(SavePostDto dto){
        return PostEntity.builder()
                .tittle(dto.getTittle())
                .build();
    }
}
