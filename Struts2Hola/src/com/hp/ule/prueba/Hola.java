package com.hp.ule.prueba;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Hola extends ActionSupport {
   private String nombre;
   private int edad;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
public String execute() {
        //System.out.println(nombre);
        return SUCCESS;
    }
}