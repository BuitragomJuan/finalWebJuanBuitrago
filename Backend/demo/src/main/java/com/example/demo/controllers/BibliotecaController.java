package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Biblioteca;
import com.example.demo.model.BibliotecaRepository;

@RestController
@RequestMapping("/api/Biblioteca")
public class BibliotecaController {

    @Autowired
    private BibliotecaRepository bRepository;

    @GetMapping
    public ResponseEntity<List<Biblioteca>> getAllBibliotecas() {
        List<Biblioteca> bibliotecas = (List<Biblioteca>) bRepository.findAll();
        return new ResponseEntity<>(bibliotecas, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Biblioteca> addBiblioteca(@RequestBody Biblioteca biblioteca) {
        // You might want to perform additional validation or logic here
        Biblioteca savedBiblioteca = bRepository.save(biblioteca);
        return new ResponseEntity<>(savedBiblioteca, HttpStatus.CREATED);
    }
    
}
