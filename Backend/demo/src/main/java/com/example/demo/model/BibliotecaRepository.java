package com.example.demo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecaRepository extends CrudRepository<Biblioteca,Integer>{

    
    
}
