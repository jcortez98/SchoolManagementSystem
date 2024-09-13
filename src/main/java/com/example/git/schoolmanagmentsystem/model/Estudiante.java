package com.example.git.schoolmanagmentsystem.model;

import java.sql.Date;

import com.example.git.schoolmanagmentsystem.util.Estado;

public class Estudiante {

    private Long id;
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private Estado estado;
    
    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, String apellido, Date fechaDeNacimiento, Estado estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento="
                + fechaDeNacimiento + ", estado=" + estado + "]";
    }

    
}
