package com.gateway.task;

import com.gateway.task.domain.SingleRate;
import com.gateway.task.services.SetUpFixerIoService;
import com.gateway.task.services.SingleRateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class GatewayApplication {


	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

/*	@Bean
	public CommandLineRunner latestRate(SetUpFixerIoService setUpFixerIoService) {
		return args -> {

			SingleRate s1 = new SingleRate();
			s1.setId((long) 1);
			s1.setBasecurencyType(setUpFixerIoService.allRates("USD").getBase());
			s1.setCurencyType("USD");
			s1.setCurrencyValue(setUpFixerIoService.allRates("USD").getRates().get("USD"));
			s1.setDate(setUpFixerIoService.allRates("USD").getDate());
			s1.setTimeStamp(setUpFixerIoService.allRates("USD").getTimestamp());
			log.info(s1.toString());

		};
	}*/

}
