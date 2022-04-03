package com.blackedin.backend.controllers;

import java.util.List;

import com.blackedin.backend.models.Curriculo;
import com.blackedin.backend.repositories.CurriculoRepository;

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
public class CurriculoController {
    
    @Autowired
    private CurriculoRepository cRepo;

    @GetMapping("/curriculos")
    public List<Curriculo> getAllCurriculos() {
        return cRepo.findAll();
    }

    @PostMapping("/curriculos")
    public Curriculo saveCurriculo(@RequestBody Curriculo curriculo) {
        return cRepo.save(curriculo);
    }

    @GetMapping("/curriculos/{id}")
    public Curriculo getSingleCurriculo(@PathVariable Long id) {
        return cRepo.findById(id).get();
    }

    @PutMapping("/curriculos")
    public Curriculo updateCurriculoDetails(@RequestBody Curriculo curriculo) {
        return cRepo.save(curriculo);
    }
    
    @DeleteMapping("/curriculos/{id}")
    public ResponseEntity<HttpStatus> deleteCurriculoById(@PathVariable Long id) {

        cRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
}
