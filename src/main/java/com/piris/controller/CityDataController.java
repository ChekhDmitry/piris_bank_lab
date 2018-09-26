package com.piris.controller;

import com.piris.entity.CityEntity;
import com.piris.service.dao.CityEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/city")
public class CityDataController {

    @Autowired
    private CityEntityService cityEntityService;

    @RequestMapping("")
    @ResponseBody
    public List<CityEntity> getAllCities(){
        return cityEntityService.findAll();
    }


}
