package com.blackedin.backend.controllers;

import java.util.List;

import com.blackedin.backend.models.Vaga;
import com.blackedin.backend.repositories.VagaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class VagaController {
    
    @Autowired
    private VagaRepository vRepo;

    @GetMapping("/vagas")
    public List<Vaga> getAllVagas() {
        return vRepo.findAll();
    }

    @PostMapping("/vagas")
    public Vaga saveVaga(@RequestBody Vaga vaga) {
        return vRepo.save(vaga);
    }

    @GetMapping("/vagas/{id}")
    public Vaga getSingleVaga(@PathVariable Long id) {
        return vRepo.findById(id).get();
    }

    @PutMapping("/vagas")
    public Vaga updateVagaDetails(@RequestBody Vaga vaga) {
        return vRepo.save(vaga);
    }
    
    @DeleteMapping("/vagas/{id}")
    public ResponseEntity<HttpStatus> deleteVagaById(@PathVariable Long id) {

        vRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
}
