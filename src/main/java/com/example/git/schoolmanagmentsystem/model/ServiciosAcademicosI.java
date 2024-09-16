package com.example.git.schoolmanagmentsystem.model;

import com.example.git.schoolmanagmentsystem.util.Exceptions.EstudianteNoInscritoEnCursoException;
import com.example.git.schoolmanagmentsystem.util.Exceptions.EstudianteYaInscritoException;

public interface ServiciosAcademicosI {
    void matricularEstudiante(Estudiante estudiante);

    void agregarCurso(Curso curso);

    void inscribirEstudianteCurso(Estudiante estudiante, Integer idCurso) throws EstudianteYaInscritoException;

    void desinscribirEstudianteCurso(Integer idEstudiante, Integer idCurso) throws EstudianteNoInscritoEnCursoException;
}
