package com.diy4rent.backend.repository;
import org.springframework.data.repository.JpaRepository;
import com.diy4rent.backend.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
