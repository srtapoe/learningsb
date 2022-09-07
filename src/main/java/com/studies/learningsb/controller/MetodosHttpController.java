package com.studies.learningsb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requests")
public class MetodosHttpController {

    @GetMapping
    public String get(){
        return "Request Get";
    }

    @PostMapping
    public String post(){
        return "Request Post";
    }

    @PutMapping
    public String put(){
        return "Request Put";
    }

    @PatchMapping
    public String patch(){
        return "Request Patch";
    }

    @DeleteMapping
    public String delete(){
        return "Request delete";
    }
}
