package com.example.msingressrelations.service;

import com.example.msingressrelations.dao.repository.PostRepository;
import com.example.msingressrelations.mapper.PostDetailMapper;
import com.example.msingressrelations.mapper.PostMapper;
import com.example.msingressrelations.model.dto.SavePostDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.Serial;

import static com.example.msingressrelations.mapper.PostDetailMapper.buildPostDetailEntity;
import static com.example.msingressrelations.mapper.PostMapper.buildPostEntity;

@Service
@Slf4j
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final TagService tagService;

    public void savePost(SavePostDto request){
        var post= buildPostEntity(request);
        var postDetail= buildPostDetailEntity(post, request.getCreatedBy());
//
//        if(!request.getTagsIds().isEmpty()){
////            var tags=tagService
//        }
        post.setDetail(postDetail);
        postRepository.save(post);

    }
}
