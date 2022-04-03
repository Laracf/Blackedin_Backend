package com.blackedin.backend.repositories;
import com.blackedin.backend.models.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long>{
    
}