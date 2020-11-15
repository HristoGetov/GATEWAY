package com.gateway.task;

import com.gateway.task.domain.SingleRate;
import com.gateway.task.repositories.SingleRateRepository;
import com.gateway.task.services.SetUpFixerIoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;


@Component

public class LoadingData {

    private SingleRateRepository singleRateRepository;

    @Autowired
    public LoadingData(SingleRateRepository singleRateRepository) {
        this.singleRateRepository = singleRateRepository;
    }

    @Bean
    public RestTemplate restTemplate(){return new RestTemplate();}

   @Bean
   @Scheduled(cron = "0 0 14 * * ?")
    public String loadDataToDatabase(SetUpFixerIoService setUpFixerIoService){

        Iterator<Map.Entry<String, BigDecimal>> allRates =
                setUpFixerIoService.allRates().getRates().entrySet().iterator();

        while (allRates.hasNext()){
            SingleRate s1 = new SingleRate();
            Map.Entry<String,BigDecimal> singleRate = allRates.next();
            s1.setBasecurencyType(setUpFixerIoService.allRates().getBase());
            s1.setCurencyType(singleRate.getKey());
            s1.setQty(1);
            s1.setCurrencyValue(singleRate.getValue());
            s1.setDate(setUpFixerIoService.allRates().getDate());
            s1.setTimeStamp(setUpFixerIoService.allRates().getTimestamp());
            singleRateRepository.save(s1);
        }



        return "Done";
    }


}
