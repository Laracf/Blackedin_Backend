package com.blackedin.backend.repositories;
import com.blackedin.backend.models.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VagaRepository extends JpaRepository<Vaga, Long>{
    
}