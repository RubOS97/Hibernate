/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import model.Direccion;
import model.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Maite
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS CONEXION
        //SessionFactory sessionFactory;
        //Configuration configuration = new Configuration();
        //configuration.configure();
        //sessionFactory = configuration.buildSessionFactory();
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // CREAMOS UN OBJETO
        Direccion direccion = new Direccion(8, "Calle Reina", 5, "Xàtiva", "Valencia");
        Profesor profesor = new Profesor(12, "Pepe", "Garcia", "Perez");
        profesor.setDireccion(direccion);

        //CREAR UNA SESION
        Session session = factory.openSession();
        session.beginTransaction();

        //GUARDAR OBJETO
        //session.save(profesor);
        //CERRAR CONEXION
        session.getTransaction().commit();
        session.close();
        factory.close();

    }

}
