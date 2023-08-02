package com.example.msingressrelations.service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.Random;

@Service
@Slf4j
public class MessageService {
    @SneakyThrows
    public String getMessage(String lang) {
        Thread.sleep(new Random().nextInt(2000));
        return "Hello world";
    }
    public void check(){
        System.out.println(5/0);

    }

    @SneakyThrows
    public String getMessage2() {
        Thread.sleep(new Random().nextInt(1000));
        return "Hello";
    }
}
