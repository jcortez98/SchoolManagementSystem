package com.example.git.schoolmanagmentsystem.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorAcademico {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;
    private Map<Curso, List<Estudiante>> asignaciones;

    public GestorAcademico(){
        estudiantes = new ArrayList<>();
        cursos = new ArrayList<>();
        asignaciones = new HashMap<>();
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Map<Curso, List<Estudiante>> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(Map<Curso, List<Estudiante>> asignaciones) {
        this.asignaciones = asignaciones;
    }

    @Override
    public String toString() {
        return "Curso [estudiantes=" + estudiantes + ", cursos=" + cursos + ", asignaciones=" + asignaciones + "]";
    }

}
