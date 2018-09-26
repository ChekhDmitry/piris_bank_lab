package com.piris.service.dao;

import com.piris.entity.CityEntity;
import java.util.List;

public interface CityEntityService {
    CityEntity save(CityEntity cityEntity);
    CityEntity findById(int id);
    List<CityEntity> findAll();
    long count();
    void deleteById(int id);
}
