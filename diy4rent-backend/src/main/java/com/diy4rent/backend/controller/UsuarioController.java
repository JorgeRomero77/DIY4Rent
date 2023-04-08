package com.diy4rent.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diy4rent.backend.model.Usuario;
import com.diy4rent.backend.repository.UsuarioRepository;

import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;
import static java.util.logging.Level.WARNING;
import static java.util.stream.Collectors.*;

public static final Logger LOGGER = Logger.getLogger(Usuario.class.getId());

private UsuarioRepository usuarioRepository;

public UsuarioController(UsuarioRepository usuarioRepository) {
    this.usuarioRepository = usuarioRepository;
}

@CrossOrigin(origins = "https://localhost:3000/")
@RestController
@ApiOperation(value = "Obtiene un usuario por su ID", response = Usuario.class)
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Usuario encontrado"),
        @ApiResponse(code = 404, message = "Usuario no encontrado")
        @ApiResponse(code = 500, message = "Error interno del servidor")
})
@RequestMapping("/login")
public ResponseEntity<Void> login(@RequestHeader("Usuario") String usuario, @RequestHeader("Contraseña") String contraseña) {
    checkCredentialsCorrectness(usuario, contraseña);
    return new ResponseEntity<>(null, HttpStatus.OK);
}

