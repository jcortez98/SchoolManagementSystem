package com.example.git.schoolmanagmentsystem.system;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.example.git.schoolmanagmentsystem.model.Curso;
import com.example.git.schoolmanagmentsystem.model.Estudiante;
import com.example.git.schoolmanagmentsystem.model.GestorAcademico;
import com.example.git.schoolmanagmentsystem.util.Estado;
import com.example.git.schoolmanagmentsystem.util.Exceptions.EstudianteNoInscritoEnCursoException;
import com.example.git.schoolmanagmentsystem.util.Exceptions.EstudianteYaInscritoException;

public class Main {
    public static void main(String[] args) throws EstudianteYaInscritoException, EstudianteNoInscritoEnCursoException {
        GestorAcademico gestorAcademico = new GestorAcademico();
        Curso matematica = new Curso("Matematica", "Numeros", 2, "2.2");
        Curso ciencias = new Curso("Ciencias", "Naturaleza", 1, "1.8");
    
        Estudiante e1 = new Estudiante("Carlos", "Cortez", Date.valueOf("1998-12-31") , Estado.MATRICULADO);
        Estudiante e2 = new Estudiante("Luis", "Hernandez", Date.valueOf("1999-06-23") , Estado.INACTIVO);
        Estudiante e3 = new Estudiante("Pedro", "Hernandez", Date.valueOf("1999-06-23") , Estado.INACTIVO);
        Estudiante e4 = new Estudiante("Paco", "Hernandez", Date.valueOf("1999-06-23") , Estado.INACTIVO);
        Estudiante e5 = new Estudiante("Hugo", "Hernandez", Date.valueOf("1999-06-23") , Estado.INACTIVO);

        gestorAcademico.agregarCurso(matematica);
        gestorAcademico.agregarCurso(ciencias);
        gestorAcademico.matricularEstudiante(e1);
        gestorAcademico.matricularEstudiante(e2);
        gestorAcademico.matricularEstudiante(e3);
        gestorAcademico.matricularEstudiante(e4);
        gestorAcademico.matricularEstudiante(e5);


        gestorAcademico.inscribirEstudianteCurso(e1, matematica.getId());
        gestorAcademico.inscribirEstudianteCurso(e2, matematica.getId());
        gestorAcademico.inscribirEstudianteCurso(e3, matematica.getId());
        gestorAcademico.inscribirEstudianteCurso(e3, ciencias.getId());
        gestorAcademico.inscribirEstudianteCurso(e4, ciencias.getId());
        gestorAcademico.inscribirEstudianteCurso(e5, ciencias.getId());

        System.out.println("MATEMATICA");
        List<Estudiante> estudiantesMate = gestorAcademico.getAsignaciones().get(matematica);
        estudiantesMate.forEach(e -> System.out.println(e));
        
        System.out.println("CIENCIAS");
        List<Estudiante> estudiantesCiencias = gestorAcademico.getAsignaciones().get(ciencias);
        estudiantesCiencias.forEach(e -> System.out.println(e));

        gestorAcademico.desinscribirEstudianteCurso(e1.getId(), matematica.getId());
        
        System.out.println("MATEMATICA");
        estudiantesMate.forEach(e -> System.out.println(e));
        
        System.out.println("CIENCIAS");
        estudiantesCiencias.forEach(e -> System.out.println(e));


        
    }
}
