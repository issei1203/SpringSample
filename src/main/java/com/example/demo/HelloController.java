package com.example.demo;

import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HelloController {

    private HelloService helloService;

    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }

    @GetMapping("/")
    String Message(Model model){
        List<HelloEntity> helloEntityList = helloService.getMessageList();
        model.addAttribute("helloEntityList",helloEntityList);
        return "hello";
    }

    @PostMapping("/")
    String Register(Model model, @RequestParam(value = "message",defaultValue = "")String message) {
        helloService.registerMessage(message);
        return "redirect:/";
    }
}
