package com.blackedin.backend.controllers;

import java.util.List;

import com.blackedin.backend.models.Profissional;
import com.blackedin.backend.repositories.ProfissionalRepository;

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
public class ProfissionalController {
    
    @Autowired
    private ProfissionalRepository pRepo;

    @GetMapping("/profissionais")
    public List<Profissional> getAllProfissionals() {
        return pRepo.findAll();
    }

    @PostMapping("/profissionais")
    public Profissional saveProfissional(@RequestBody Profissional profissional) {
        return pRepo.save(profissional);
    }

    @GetMapping("/profissionais/{id}")
    public Profissional getSingleProfissional(@PathVariable Long id) {
        return pRepo.findById(id).get();
    }

    @PutMapping("/profissionais")
    public Profissional updateProfissionalDetails(@RequestBody Profissional profissional) {
        return pRepo.save(profissional);
    }
    
    @DeleteMapping("/profissionais/{id}")
    public ResponseEntity<HttpStatus> deleteProfissionalById(@PathVariable Long id) {

        pRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
}