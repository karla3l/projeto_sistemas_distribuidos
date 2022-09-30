/* package main.java.ifms.edu.br.projeto_rest_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.ifms.edu.br.projeto_rest_client.service.WorkerService;

@RestController
    @RequestMapping(value = "/worker")
    public class WorkerController{

        @Autowired
        WorkerService workerService;

        @GetMapping
       public ResponseEntity<String> getWorker (){

            return new ResponseEntity.ok(workerService.getGreetingDescription());
       }
          
}
    

 */