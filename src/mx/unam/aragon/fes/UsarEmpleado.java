/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes;

/**
 *
 * @author Feer´ SI
 */
public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        emp1.setNombre("José");
        emp1.setSueldo(10000.00f);
        emp1.setHorasExtras(10);
        float cobro = emp1.calcularSueldo();
        System.out.println("Gran total: " + cobro);
        System.out.println( emp1.toString() );
    }
}
