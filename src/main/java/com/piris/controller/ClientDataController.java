package com.piris.controller;

import com.piris.entity.ClientEntity;
import com.piris.service.dao.ClientEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/client")
public class ClientDataController {

    @Autowired
    private ClientEntityService clientEntityService;

    @PutMapping("")
    @ResponseBody
    public String addNewClient () {
        return "Saved";
    }

    @GetMapping("")
    @ResponseBody
    public List<ClientEntity> getAllClients() {
        return clientEntityService.findAll();
    }
}
