package com.example.msingressrelations.controller;

import com.example.msingressrelations.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/messages")
@RequiredArgsConstructor
@Slf4j
public class MessageController {
    private final MessageService messageService;

    @GetMapping
    public String getMessage( String language){
//        log.info("ActionLog.getMessage.start.language: {}",language);
        return messageService.getMessage(language);
    }
    @GetMapping("/2")
    public String getMessage2(){
        return messageService.getMessage2();
    }
    @GetMapping("/3")
    public void getCheck(){
        messageService.check();
    }
}
