package com.piris.service.dao;

import com.piris.entity.ClientEntity;

import java.util.List;

public interface ClientEntityService {
    ClientEntity save(ClientEntity clientEntity);
    ClientEntity findById(int id);
    List<ClientEntity> findAll();
    long count();
    void deleteById(int id);
    ClientEntity findBySurnameAndNameAndFathersName(String surname, String name, String fathersName);
    ClientEntity findByPassportSeriesAndPassportNumber(String passportSeries, int passportNumber);
    ClientEntity findByPassportId(String passportId);
}
