package com.blackedin.backend.repositories;
import com.blackedin.backend.models.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long>{
    
}