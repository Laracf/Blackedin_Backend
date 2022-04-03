package com.blackedin.backend.controllers;

import java.util.List;

import com.blackedin.backend.models.Empresa;
import com.blackedin.backend.repositories.EmpresaRepository;

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
public class EmpresaController {
    
    @Autowired
    private EmpresaRepository eRepo;

    @GetMapping("/empresas")
    public List<Empresa> getAllEmpresas() {
        return eRepo.findAll();
    }

    @PostMapping("/empresas")
    public Empresa saveEmpresa(@RequestBody Empresa empresa) {
        return eRepo.save(empresa);
    }

    @GetMapping("/empresas/{id}")
    public Empresa getSingleEmpresa(@PathVariable Long id) {
        return eRepo.findById(id).get();
    }

    @PutMapping("/empresas")
    public Empresa updateEmpresaDetails(@RequestBody Empresa empresa) {
        return eRepo.save(empresa);
    }
    
    @DeleteMapping("/empresas/{id}")
    public ResponseEntity<HttpStatus> deleteEmpresaById(@PathVariable Long id) {

        eRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
}