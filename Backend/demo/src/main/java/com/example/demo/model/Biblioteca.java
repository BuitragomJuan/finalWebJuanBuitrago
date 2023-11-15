package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
    name = "Biblioteca"
)
public class Biblioteca {

    @Id
    @Column(
        name= "id",
        nullable = false,
        columnDefinition = "Integer"
    )
    private int id;

    @Column(
        name = "Nombre",
        nullable = false,
        columnDefinition = "Text"
    )
    private String Nombre;

    @Column(
        name = "Direccion",
        nullable = false,
        columnDefinition = "Text"
    )
    private String Direccion;

    @Column(
        name = "Ciudad",
        nullable = false,
        columnDefinition = "Text"
    )
    private String Ciudad;

    public Biblioteca(){
        this.id = 0;
        this.Nombre = null;
        this.Direccion = null;
        this.Ciudad = null;
    }

    public Biblioteca(int id, String nombre, String direccion, String ciudad){
        this.id = id;
        this.Nombre = nombre;
        this.Direccion =direccion;
        this.Ciudad = ciudad;
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

    public void setDireccion(String direccion){
        this.Direccion= direccion;
    }

    public String getDireccion(){
        return this.Direccion;
    }

    public void setCiudad(String ciudad){
        this.Ciudad = ciudad;
    }

    public String getCiudad(){
        return this.Ciudad;
    }
        
}
