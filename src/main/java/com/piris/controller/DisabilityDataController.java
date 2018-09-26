package com.piris.controller;

import com.piris.entity.DisabilityEntity;
import com.piris.service.dao.DisabilityEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/disability")
public class DisabilityDataController {

    @Autowired
    private DisabilityEntityService disabilityEntityService;

    @GetMapping("")
    @ResponseBody
    public List<DisabilityEntity> getAllDisabilities(){
        return disabilityEntityService.findAll();
    }
}
