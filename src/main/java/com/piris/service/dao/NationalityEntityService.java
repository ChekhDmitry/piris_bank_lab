package com.piris.service.dao;

import com.piris.entity.NationalityEntity;

import java.util.List;

public interface NationalityEntityService {
    NationalityEntity save(NationalityEntity nationalityEntity);
    NationalityEntity findById(int id);
    List<NationalityEntity> findAll();
    long count();
    void deleteById(int id);
}
