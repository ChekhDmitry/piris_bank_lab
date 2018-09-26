package com.piris.service.dao.impl;

import com.piris.entity.DisabilityEntity;
import com.piris.repository.DisabilityEntityRepository;
import com.piris.service.dao.DisabilityEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DisabilityEntityServiceImpl implements DisabilityEntityService {

    @Autowired
    private DisabilityEntityRepository disabilityEntityRepository;

    @Override
    public DisabilityEntity save(DisabilityEntity disabilityEntity) {
        return disabilityEntityRepository.save(disabilityEntity);
    }

    @Override
    public DisabilityEntity findById(int id) {
        return disabilityEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<DisabilityEntity> findAll() {
        return (List<DisabilityEntity>) disabilityEntityRepository.findAll();
    }

    @Override
    public long count() {
        return disabilityEntityRepository.count();
    }

    @Override
    public void deleteById(int id) {
        disabilityEntityRepository.deleteById(id);
    }
}
