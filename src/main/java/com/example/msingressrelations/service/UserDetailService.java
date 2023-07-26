package com.example.msingressrelations.service;

import com.example.msingressrelations.dao.repository.UserDetailRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserDetailService {
    private final UserDetailRepository repository;
    @PostConstruct
    public void test(){
        var users= repository.findByNameContaining("Agahuseyn");
        users.get(0).getAddresses().forEach(it-> System.out.println(it.getId()));
    }
}
