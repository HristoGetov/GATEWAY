package com.gateway.task.services;

import com.gateway.task.domain.SingleRate;
import com.gateway.task.repositories.SingleRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service
public class SingleRateServiceImpl implements SingleRateService {

    private SingleRateRepository singleRateRepository;


    @Autowired
    public SingleRateServiceImpl(SingleRateRepository singleRateRepository) {
        this.singleRateRepository = singleRateRepository;

    }

    @Override
    public SingleRate saveOrUpdate(SingleRate singleRate) {
        singleRateRepository.save(singleRate);
        return singleRate;
    }

    @Override
    public SingleRate getByDate(Date date) {
        return null;
    }

    @Override
    public SingleRate getById(Long id) {
        return null;
    }
}
