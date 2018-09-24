package com.piris.controller;

import com.piris.entity.ClientEntity;
import com.piris.repository.ClientEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentDataController {

    @Autowired
    private ClientEntityRepository studentEntityRepository;

    @GetMapping(path="/add")
    @ResponseBody
    public String addNewUser (@RequestParam String name, @RequestParam String surname) {

        return "Saved";
    }

    @GetMapping(path="/all")
    @ResponseBody
    public List<ClientEntity> getAllUsers() {
        return (List<ClientEntity>) studentEntityRepository.findAll();
    }
}
