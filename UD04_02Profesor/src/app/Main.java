/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import model.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Sandra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SessionFactory sessionfactory;
        Configuration config = new Configuration();
        config.configure();
        config.addClass(Profesor.class);
        sessionfactory = config.buildSessionFactory();
        
        //CREAMOS UN OBJETO
        Profesor profesor=new Profesor(2, "Pepe", "García", "Pérez");
        
        //CREAR UNA SESION
        Session session=sessionfactory.openSession();
        session.beginTransaction();
        
        //GUARDAR OBJETO
        session.save(profesor);
        
        //CERRAR CONEXIÓN
        session.getTransaction().commit();
        session.close();
    }
    
}
