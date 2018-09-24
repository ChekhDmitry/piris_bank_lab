package com.piris.repository;

import com.piris.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClientEntityRepository extends CrudRepository<ClientEntity, Integer> {
}
