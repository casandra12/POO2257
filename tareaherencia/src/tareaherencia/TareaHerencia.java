/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaherencia;

import ico.fes.aragon.Alumno;


/**
 *
 * @author cassm
 */
public class TareaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a1 = new Alumno();
        a1.setNombre("Casandra Monserrat");
        a1.setEdad(19);
        //1 es Hombre, 2 es Mujer
        a1.setGenero(1);
        a1.setAltura(1.74f);
        
        a1.setNumeroCuenta("6656887722");
        a1.setCarrera("economia");
        a1.setSemestre(2);
        
        Alumno a2 = new Alumno("5566778899","ciencias",4,"Polaa mayuga",21,2,1.66f);
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
    
}
