package com.example.git.schoolmanagmentsystem.model;

import java.sql.Date;

import com.example.git.schoolmanagmentsystem.util.Estado;

public class Estudiante extends Persona {

    private Estado estado;
    
    public Estudiante() {

    }

    public Estudiante(String nombre, String apellido, Date fechaDeNacimiento, Estado estado) {
        super(nombre, apellido, fechaDeNacimiento);
        this.estado = estado;
    }

    public Estudiante(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estudiante [Persona" + super.toString() + "estado=" + estado + "]";
    }

    
    

    
}
