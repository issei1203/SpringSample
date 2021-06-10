package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    private final HelloRepository helloRepository;

    public HelloService(HelloRepository helloRepository){
        this.helloRepository = helloRepository;
    }

    void registerMessage(String message){
        HelloEntity helloEntity = new HelloEntity(message);
        helloRepository.saveAndFlush(helloEntity);
    }

    List<HelloEntity> getMessageList(){
        return helloRepository.findAll();
    }
}
