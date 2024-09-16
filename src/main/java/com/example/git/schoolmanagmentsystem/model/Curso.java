package com.example.git.schoolmanagmentsystem.model;

public class Curso {

    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer numeroCreditos;
    private String version;
    
    public Curso() {
    }

    public Curso(String nombre, String descripcion, Integer numeroCreditos, String version) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroCreditos = numeroCreditos;
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(Integer numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", numeroCreditos="
                + numeroCreditos + ", version=" + version + "]";
    }
}
