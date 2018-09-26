package com.piris.service.dao;

import com.piris.entity.MaritalStatusEntity;

import java.util.List;

public interface MaritalStatusEntityService {
    MaritalStatusEntity save(MaritalStatusEntity maritalStatusEntity);
    MaritalStatusEntity findById(int id);
    List<MaritalStatusEntity> findAll();
    long count();
    void deleteById(int id);
}
