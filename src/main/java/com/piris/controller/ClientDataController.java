package com.piris.controller;

import com.piris.dto.ClientDto;
import com.piris.entity.ClientEntity;
import com.piris.factory.EntityFactory;
import com.piris.service.dao.ClientEntityService;
import com.piris.validation.ClientDtoValidator;
import com.piris.validation.converter.ValidationResponseDataConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/client")
public class ClientDataController {

    @Autowired
    private ClientEntityService clientEntityService;

    @Autowired
    private ClientDtoValidator clientDtoValidator;

    @Autowired
    private ValidationResponseDataConverter validationResponseDataConverter;

    @Autowired
    private EntityFactory entityFactory;

    @PutMapping(value = "", produces = "application/json")
    @ResponseBody
    public Map<String, String> addNewClient (@RequestBody ClientDto clientDto, BindingResult bindingResult) {

        clientDtoValidator.validate(clientDto, bindingResult);

        if (bindingResult.hasErrors()) {
            return validationResponseDataConverter.convertFieldErrorsToMap(bindingResult.getFieldErrors());
        }

        ClientEntity clientEntity = entityFactory.createClientEntityByDto(clientDto);
        clientEntityService.save(clientEntity);

        return null;
    }

    @DeleteMapping(value = "", produces = "application/json")
    @ResponseBody
    public void deleteClients (@RequestBody List<String> clientIds) {

        for(String clientId : clientIds) {
            clientEntityService.deleteById(Integer.parseInt(clientId));
        }
    }

    @GetMapping("")
    @ResponseBody
    public List<ClientEntity> getAllClients() {
        return clientEntityService.findAll();
    }
}
