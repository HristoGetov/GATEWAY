package com.gateway.task.services;

import com.gateway.task.domain.AllRates;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SetUpFixerIoService {

    private final String API_ACCESS_KEY = "8618290f9ea65376991340c225de8b20";

    private RestTemplate restTemplate;

    public SetUpFixerIoService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public AllRates allRates(){
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://data.fixer.io/api/latest")
                .queryParam("access_key", API_ACCESS_KEY)
                .queryParam("symbols");
        return restTemplate.getForObject(builder.toUriString(),AllRates.class);
    }


}
