package com.piris.service.dao.impl;

import com.piris.entity.NationalityEntity;
import com.piris.repository.NationalityEntityRepository;
import com.piris.service.dao.NationalityEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NationalityEntityServiceImpl implements NationalityEntityService {

    @Autowired
    private NationalityEntityRepository nationalityEntityRepository;

    @Override
    public NationalityEntity save(NationalityEntity nationalityEntity) {
        return nationalityEntityRepository.save(nationalityEntity);
    }

    @Override
    public NationalityEntity findById(int id) {
        return nationalityEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<NationalityEntity> findAll() {
        return (List<NationalityEntity>) nationalityEntityRepository.findAll();
    }

    @Override
    public long count() {
        return nationalityEntityRepository.count();
    }

    @Override
    public void deleteById(int id) {
        nationalityEntityRepository.deleteById(id);
    }
}
