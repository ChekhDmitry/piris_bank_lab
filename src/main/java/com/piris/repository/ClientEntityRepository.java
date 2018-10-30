package com.piris.repository;

import com.piris.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClientEntityRepository extends CrudRepository<ClientEntity, Integer> {
    ClientEntity findBySurnameAndNameAndFathersName(String surname, String name, String fathersName);
    ClientEntity findByPassportSeriesAndPassportNumber(String passportSeries, int passportNumber);
    ClientEntity findByPassportId(String passportId);
}
