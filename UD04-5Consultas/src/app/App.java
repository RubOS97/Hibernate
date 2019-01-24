/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.List;
import model.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

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
        //Profesor profesor=new Profesor(7,"Pepe","Garcia","Perez");
        //CREAR UNA SESION
        Session session = factory.openSession();
        Query query = session.createQuery("SELECT p FROM Profesor p");

        List<Profesor> profesores = query.list();

        for (Profesor profe : profesores) {
            System.out.println(profe);
        }

        query = session.createQuery("SELECT p.id, p.nombre FROM Profesor p");
        List<Object[]> listDatos = query.list();
        for (Object[] datos : listDatos) {
            System.out.println(datos[0] + "---" + datos[1]);
        }

        query = session.createQuery("SELECT p.nombre FROM Profesor p");
        List<Object> datosLista = query.list();
        for (Object dato : datosLista) {
            System.out.println(dato);
        }
        session.close();
        factory.close();

    }

}
