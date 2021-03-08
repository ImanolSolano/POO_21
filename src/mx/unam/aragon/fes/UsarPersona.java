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
public class UsarPersona {
    public static void main(String[] args) {
        System.out.println("Programa usar persona");
        Persona per1=new Persona();
        Persona per2=new Persona();

        System.out.println( per1.getNombre() );

        per2.setNombre("Imanol");
        System.out.println( per2.getNombre() );
        per2.setApParetno("Solano");
        System.out.println(per2.getApPaterno());
        per2.setApMaterno("Soriano");
        System.out.println(per2.getApMaterno());
        System.out.println( per2.toString() );
        per2.setEdad( 18 );
        System.out.println( per2.toString() );

    }
}
