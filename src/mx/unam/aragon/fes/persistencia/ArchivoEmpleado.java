/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes.persistencia;

import java.util.ArrayList;
import mx.unam.aragon.fes.Empleado;

/**
 *
 * @author Feer´ SI
 */
public class ArchivoEmpleado {
    private String Archivo;

    public ArchivoEmpleado() {
    }

    public ArchivoEmpleado(String Archivo) {
        this.Archivo = Archivo;
    }

    public String getArchivo() {
        return Archivo;
    }

    public void setArchivo(String Archivo) {
        this.Archivo = Archivo;
    }
    
    public void GuardarEmpleados(ArrayList<Empleado> datos){
    //Aquí el código para grabar el disco duro
    
    }
    
    public ArrayList<Empleado> leerEmpleados(){
    ArrayList<Empleado> tmp=null;
    
    
    
    return tmp;
    }
    
    }
