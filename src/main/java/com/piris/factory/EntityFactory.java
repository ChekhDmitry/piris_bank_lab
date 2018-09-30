package com.piris.factory;

import com.piris.dto.ClientDto;
import com.piris.entity.ClientEntity;
import org.springframework.stereotype.Component;

@Component
public class EntityFactory {

    public ClientEntity createClientEntityByDto(ClientDto clientDto){
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setName(clientDto.getName());
        clientEntity.setSurname(clientDto.getSurname());
        clientEntity.setFathersName(clientDto.getFathersName());
        clientEntity.setBirthday(clientDto.getBirthday());
        clientEntity.setSex(clientDto.getSex());
        clientEntity.setPassportSeries(clientDto.getPassportSeries());
        clientEntity.setPassportNumber(clientDto.getPassportNumber());
        clientEntity.setPassportId(clientDto.getPassportId());
        clientEntity.setPassportPlace(clientDto.getPassportPlace());
        clientEntity.setBirthPlace(clientDto.getBirthPlace());
        clientEntity.setCityId(clientDto.getCityId());
        clientEntity.setAddress(clientDto.getAddress());
        clientEntity.setMobileNumber(clientDto.getMobileNumber());
        clientEntity.setHomeMobileNumber(clientDto.getHomeMobileNumber());
        clientEntity.setEmail(clientDto.getEmail());
        clientEntity.setMaritalStatusId(clientDto.getMaritalStatusId());
        clientEntity.setNationalityId(clientDto.getNationalityId());
        clientEntity.setDisabilityId(clientDto.getDisabilityId());
        clientEntity.setPensionary(clientDto.getPensionary());
        clientEntity.setMonthlyIncome(clientDto.getMonthlyIncome());
        clientEntity.setMilitary(clientDto.getMilitary());
        return clientEntity;
    }
}
