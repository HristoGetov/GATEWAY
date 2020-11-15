package com.gateway.task.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllRates {

    public  boolean success;
    private Long timestamp;
    private String base;
    private Date date;
    private Map<String, BigDecimal> rates;

}
