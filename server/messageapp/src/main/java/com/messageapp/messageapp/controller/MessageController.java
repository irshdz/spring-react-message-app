package com.messageapp.messageapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.messageapp.messageapp.entity.Message;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "http://localhost:3000")
public class MessageController {
    private final List<Message> messages=new ArrayList<>();

    @GetMapping
    public List<Message> getMessages(){
        return messages;
    }

    @PostMapping
    public Message addMessage(@RequestBody Message message)
    {
        messages.add(message);
        return message;
    }
}
