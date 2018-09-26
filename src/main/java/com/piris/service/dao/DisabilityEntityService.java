package com.piris.service.dao;

import com.piris.entity.DisabilityEntity;

import java.util.List;

public interface DisabilityEntityService {
    DisabilityEntity save(DisabilityEntity disabilityEntity);
    DisabilityEntity findById(int id);
    List<DisabilityEntity> findAll();
    long count();
    void deleteById(int id);
}
