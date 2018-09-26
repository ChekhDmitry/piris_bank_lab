package com.piris.service.dao.impl;

import com.piris.entity.CityEntity;
import com.piris.repository.CityEntityRepository;
import com.piris.service.dao.CityEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityEntityServiceImpl implements CityEntityService {

    @Autowired
    private CityEntityRepository cityEntityRepository;

    @Override
    public CityEntity save(CityEntity cityEntity) {
        return cityEntityRepository.save(cityEntity);
    }

    @Override
    public CityEntity findById(int id) {
        return cityEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<CityEntity> findAll() {
        return (List<CityEntity>)cityEntityRepository.findAll();
    }

    @Override
    public long count() {
        return cityEntityRepository.count();
    }

    @Override
    public void deleteById(int id) {
        cityEntityRepository.deleteById(id);
    }
}
