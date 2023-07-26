package com.example.msingressrelations.controller;

import com.example.msingressrelations.model.dto.SavePostDto;
import com.example.msingressrelations.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("v1/relation/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    @PostMapping
    @ResponseStatus(CREATED)
    public void savePost(@RequestBody SavePostDto savePostDto){
        postService.savePost(savePostDto);
    }
}
