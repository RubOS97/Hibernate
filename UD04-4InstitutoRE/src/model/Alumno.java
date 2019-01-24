/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Pauessa
 */
public class Alumno implements Serializable{
    int id;
    String nombre;
    float sueldo;
    boolean registrado;
    Date fechaNac;
    Date horaTutoria;
    Date fechaRegistro;
    String observaciones;

    public Alumno() {
    }

    public Alumno(int id, String nombre, float sueldo, boolean registrado, Date fechaNac, Date horaTutoria, Date fechaRegistro, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.registrado = registrado;
        this.fechaNac = fechaNac;
        this.horaTutoria = horaTutoria;
        this.fechaRegistro = fechaRegistro;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isRegistrado() {
        return registrado;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Date getHoraTutoria() {
        return horaTutoria;
    }

    public void setHoraTutoria(Date horaTutoria) {
        this.horaTutoria = horaTutoria;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
