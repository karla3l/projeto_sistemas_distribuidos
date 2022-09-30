package main.java.ifms.edu.br.projeto_rest_client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import main.java.ifms.edu.br.projeto_rest_client.model.Greeting;


@Service
public class WorkerService {

    @Autowired
    private RestTemplate restTemplate;

    public String getGreetingDescription (){
        Greeting greeting = restTemplate.getForObject("http://localhost:8080/greeting", Greeting.class);
        return greeting.getDescription();
    }
    
}
