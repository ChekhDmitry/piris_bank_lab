package com.piris.controller;

import com.piris.entity.MaritalStatusEntity;
import com.piris.service.dao.MaritalStatusEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/marital")
public class MaritalStatusDataController {

    @Autowired
    private MaritalStatusEntityService maritalStatusEntityService;

    @GetMapping("")
    @ResponseBody
    public List<MaritalStatusEntity> getAllMaritalStatuses(){
        return maritalStatusEntityService.findAll();
    }
}
