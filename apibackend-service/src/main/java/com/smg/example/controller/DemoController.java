package com.smg.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/{id}")
    public Integer getId(@PathVariable("id") Integer id){
        return id + 1;
    }
    @PostMapping("/test")
    public String getTest(){
        return "返回一个测试结果";
    }

}
