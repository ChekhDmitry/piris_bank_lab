package com.piris.service.dao.impl;

import com.piris.entity.MaritalStatusEntity;
import com.piris.repository.MaritalStatusEntityRepository;
import com.piris.service.dao.MaritalStatusEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MaritalStatusEntityServiceImpl implements MaritalStatusEntityService {

    @Autowired
    private MaritalStatusEntityRepository maritalStatusEntityRepository;

    @Override
    public MaritalStatusEntity save(MaritalStatusEntity maritalStatusEntity) {
        return maritalStatusEntityRepository.save(maritalStatusEntity);
    }

    @Override
    public MaritalStatusEntity findById(int id) {
        return maritalStatusEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<MaritalStatusEntity> findAll() {
        return (List<MaritalStatusEntity>) maritalStatusEntityRepository.findAll();
    }

    @Override
    public long count() {
        return maritalStatusEntityRepository.count();
    }

    @Override
    public void deleteById(int id) {
        maritalStatusEntityRepository.deleteById(id);
    }
}
