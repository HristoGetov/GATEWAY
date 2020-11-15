package com.gateway.task.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class SingleRate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long timeStamp;
    private Date date;
    private int qty;
    private String BasecurencyType;
    private String curencyType;
    private BigDecimal currencyValue;

    public SingleRate() {
    }

    public SingleRate(Long id, Long timeStamp, Date date, String basecurencyType, String curencyType, BigDecimal currencyValue) {
        this.id = id;
        this.timeStamp = timeStamp;
        this.date = date;
        BasecurencyType = basecurencyType;
        this.curencyType = curencyType;
        this.currencyValue = currencyValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBasecurencyType() {
        return BasecurencyType;
    }

    public void setBasecurencyType(String basecurencyType) {
        BasecurencyType = basecurencyType;
    }

    public String getCurencyType() {
        return curencyType;
    }

    public void setCurencyType(String curencyType) {
        this.curencyType = curencyType;
    }

    public BigDecimal getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(BigDecimal currencyValue) {
        this.currencyValue = currencyValue;
    }

    @Override
    public String toString() {
        return "SingleRate{" +
                "id=" + id +
                ", timeStamp=" + timeStamp +
                ", date=" + date +
                ", BasecurencyType='" + BasecurencyType + '\'' +
                ", curencyType='" + curencyType + '\'' +
                ", currencyValue=" + currencyValue +
                '}';
    }
}
