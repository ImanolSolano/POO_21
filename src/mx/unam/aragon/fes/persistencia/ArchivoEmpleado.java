/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes.persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
       try {
            ObjectOutputStream fSalida = new ObjectOutputStream(
                    new FileOutputStream(Archivo));

            fSalida.writeObject(datos);
            fSalida.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    public ArrayList<Empleado> leerEmpleados(){
    ArrayList<Empleado> tmp=null;
        try {
            ObjectInputStream fLectura = new ObjectInputStream(
                    new FileInputStream(Archivo));

            tmp = (ArrayList<Empleado>) fLectura.readObject();
            if (tmp == null) {
                System.out.println("No hay nada");
            } else {
                System.out.println("Nombre" + tmp.size());
            }
            fLectura.close();

        } catch (Exception ex) {
            System.out.println("Error" + ex.toString());
        }
        return tmp;
    }
    
}
