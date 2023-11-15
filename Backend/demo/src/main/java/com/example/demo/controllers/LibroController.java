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

import com.example.demo.model.Libro;
import com.example.demo.model.LibroRepository;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroRepository lRepository;

    @GetMapping
    public ResponseEntity<List<Libro>> getAllLibros() {
        List<Libro> libros = (List<Libro>) lRepository.findAll();
        return new ResponseEntity<>(libros, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Libro> addLibro(@RequestBody Libro libro) {
        Libro savedLibro = lRepository.save(libro);
        return new ResponseEntity<>(savedLibro, HttpStatus.CREATED);
    }
    
}
