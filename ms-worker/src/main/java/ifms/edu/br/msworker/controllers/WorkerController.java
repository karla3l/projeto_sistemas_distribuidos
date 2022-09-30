package ifms.edu.br.msworker.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifms.edu.br.msworker.models.Worker;

@RestController
@RequestMapping("/worker")
public class WorkerController {

    @GetMapping("/{id}")
    public ResponseEntity<Worker> getWorker (@PathVariable Integer id){
        var worker = new Worker(id);
        return new ResponseEntity<>(worker, HttpStatus.OK);
        
    }
    
}
