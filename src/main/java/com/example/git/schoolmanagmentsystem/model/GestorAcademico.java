package com.example.git.schoolmanagmentsystem.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.git.schoolmanagmentsystem.util.Exceptions.EstudianteNoInscritoEnCursoException;
import com.example.git.schoolmanagmentsystem.util.Exceptions.EstudianteYaInscritoException;

public class GestorAcademico implements ServiciosAcademicosI {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;
    private Map<Curso, List<Estudiante>> asignaciones;

    public GestorAcademico(){ 
        estudiantes = new ArrayList<>();
        cursos = new ArrayList<>();
        asignaciones = new HashMap<>();
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        if(!estudiantes.contains(estudiante)){
            estudiante.setId(this.estudiantes.size());
            this.estudiantes.add(estudiante);
        }else{
            System.out.println("El estudiante ya se encuentra registrado");
        }
    }

    @Override
    public void agregarCurso(Curso curso) {
        if(!cursos.contains(curso)){
            curso.setId(this.cursos.size());
            this.cursos.add(curso);
            List estudiantes = new ArrayList<>();
            asignaciones.put(curso, estudiantes);
        }else{
            System.out.println("El curso ya se encuentra registrado");
        }
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, Integer idCurso) throws EstudianteYaInscritoException {
        Curso curso = cursos.get(idCurso);
        if(!asignaciones.get(curso).contains(estudiante)){
            asignaciones.get(curso).add(estudiante);
        }else{
            throw new EstudianteYaInscritoException("El estudiante ya se encuentra registrado");
        }
        
        
    }

    @Override
    public void desinscribirEstudianteCurso(Integer idEstudiante, Integer idCurso) throws EstudianteNoInscritoEnCursoException {
        Curso curso = cursos.get(idCurso);
        Estudiante estudiante = estudiantes.get(idEstudiante);
        if(asignaciones.get(curso).contains(estudiante)){
            asignaciones.get(curso).remove(estudiante);
        }else{
            throw new EstudianteNoInscritoEnCursoException("El estudiante no se encuentra en el curso");
        }
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
