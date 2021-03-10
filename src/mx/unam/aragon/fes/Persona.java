/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes;

import java.io.Serializable;

/**
 *
 * @author Feer´ SI
 */
public class Persona implements Serializable {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private String curp;
    public Persona() {
    }

    public Persona(String nombre, String apParetno, String apMaterno, int edad, String curp) {
        this.nombre = nombre;
        this.apPaterno = apParetno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApParetno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + "\n apParetno=" + apPaterno + "\n apMaterno=" + apMaterno + "\n edad=" + edad + "\n curp=" + curp + '}';
    }

}
