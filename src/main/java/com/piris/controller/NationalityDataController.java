package com.piris.controller;

import com.piris.entity.NationalityEntity;
import com.piris.service.dao.NationalityEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nationality")
public class NationalityDataController {

    @Autowired
    private NationalityEntityService nationalityEntityService;

    @GetMapping("")
    @ResponseBody
    public List<NationalityEntity> getAllNationalities(){
        return nationalityEntityService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public NationalityEntity getNationalityById(@PathVariable int id){
        return nationalityEntityService.findById(id);
    }
}
