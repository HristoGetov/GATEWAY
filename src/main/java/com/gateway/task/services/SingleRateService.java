package com.gateway.task.services;

import com.gateway.task.domain.SingleRate;

import java.util.Date;

public interface SingleRateService {

    SingleRate saveOrUpdate(SingleRate singleRate);
    SingleRate getByDate(Date date);
    SingleRate getById(Long id);
}
