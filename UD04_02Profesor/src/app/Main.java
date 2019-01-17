/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.HashSet;
import java.util.Set;
import model.CorreoElectronico;
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
        Profesor profesor=new Profesor(8, "Pepe", "García", "Pérez");
        Set<CorreoElectronico> correosElectronicos = new HashSet<>();
        correosElectronicos.add(new CorreoElectronico(3, "sara@yahoo.com", profesor));
        correosElectronicos.add(new CorreoElectronico(2, "sara@yahoo.com", profesor));
        correosElectronicos.add(new CorreoElectronico(1, "sara@yahoo.com", profesor));
        
        profesor.setCorreosElectronicos(correosElectronicos);

        
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
