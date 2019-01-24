/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import connection.AlumnoDao;
import connection.ProfesorDao;
import java.util.Calendar;
import model.Alumno;
import model.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Ruben
 */
public class Main {

    public static void main(String[] args) {
         AlumnoDao alumnoDao = new AlumnoDao();
         ProfesorDao profesorDao = new ProfesorDao();

        //Alta
        //Alumno a = new Alumno(15, "Francisco", 20, 'S', Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), "Hola");
        //alumnoDao.altaAlumno(a);
        //System.out.println("Dado de alta");
        
        Profesor p = new Profesor("Pepe", "alberito", "tocamela", 1);
        profesorDao.altaProfesor(p);
        System.out.println("Dado de alta");


        //Consulta
        //Alumno a2 = alumnoDao.obtenerAlumno(2);
        //System.out.println("Código: "+a2.getId());
        //System.out.println("Nombre: "+a2.getNombre());

        //Baja
        //Alumno a3 = new Alumno();
        //a.setId(50);
        //alumnoDao.bajaAlumno(a);
        //System.out.println("Borrado.");
    }
   
        
    
}