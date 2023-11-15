package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(
    name="Libro"
)
public class Libro {

    @Id
    @Column(
        name= "id",
        nullable = false,
        columnDefinition = "Integer"
    )
    private int id;

    @Column(
        name="Nombre",
        nullable = false,
        columnDefinition = "Text"
    )
    private String Nombre;

    @Column(
        name="Autor",
        columnDefinition = "Text"
    )
    private String Autor;
    
    @OneToOne
    @JoinColumn(name = "BibliotecaId")
    @Column(
        name="BibliotecaId",
        columnDefinition = "Integer"
    )
    private int BibliotecaId;

    public Libro(){
        this.id = 0;
        this.Nombre = null;
        this.Autor = null;
        this.BibliotecaId = 0;
    }

    public Libro(int id, String Nombre, String Autor, int BibliotecaId){
        this.id = id;
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.BibliotecaId = BibliotecaId;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setNombre(String nombre){
        this.Nombre= nombre;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public void setAutor(String autor){
        this.Autor= autor;
    }

    public String getAutor(){
        return this.Autor;
    }

    public void setBibliotecaId(int id){
        this.BibliotecaId = id;
    }

    public int getBibliotecaId(){
        return this.BibliotecaId;
    }

}
