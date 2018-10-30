package com.piris.service.dao.impl;

import com.piris.entity.ClientEntity;
import com.piris.repository.ClientEntityRepository;
import com.piris.service.dao.ClientEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientEntityServiceImpl implements ClientEntityService {

    @Autowired
    private ClientEntityRepository clientEntityRepository;

    @Override
    public ClientEntity save(ClientEntity clientEntity) {
        return clientEntityRepository.save(clientEntity);
    }

    @Override
    public ClientEntity findById(int id) {
        return clientEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<ClientEntity> findAll() {
        return (List<ClientEntity>)clientEntityRepository.findAll();
    }

    @Override
    public long count() {
        return clientEntityRepository.count();
    }

    @Override
    public void deleteById(int id) {
        clientEntityRepository.deleteById(id);
    }

    @Override
    public ClientEntity findBySurnameAndNameAndFathersName(String surname, String name, String fathersName) {
        return clientEntityRepository.findBySurnameAndNameAndFathersName(surname, name, fathersName);
    }

    @Override
    public ClientEntity findByPassportSeriesAndPassportNumber(String passportSeries, int passportNumber) {
        return clientEntityRepository.findByPassportSeriesAndPassportNumber(passportSeries, passportNumber);
    }

    @Override
    public ClientEntity findByPassportId(String passportId) {
        return clientEntityRepository.findByPassportId(passportId);
    }
}
