package com.blackedin.backend.repositories;
import com.blackedin.backend.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
    
}