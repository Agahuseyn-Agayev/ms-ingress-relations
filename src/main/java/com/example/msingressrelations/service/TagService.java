package com.example.msingressrelations.service;

import com.example.msingressrelations.dao.entity.TagEntity;
import com.example.msingressrelations.dao.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@Slf4j
@RequiredArgsConstructor
public class TagService {
    private final TagRepository tagRepository;

    public List<TagEntity> getTagsByIds(Set<Long> ids){
        return tagRepository.findByIdIn(ids);
    }

}
