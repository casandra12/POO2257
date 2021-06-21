/*8
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoo;

import ico.fes.componentes.Monitor;
import ico.fes.PC.Computadora;
import ico.fes.componentes.CPU;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
        
     
/**
 *
 * @author cassm
 */
public class TareaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Computadora compucasarana=new Computadora();
    compucasarana.setMonitor(new Monitor("SAMSUNG","IDK",24));
    compucasarana.setTeclado(new Teclado("logitech","XD",80,6));
    compucasarana.setCpu(new CPU("AMD","5600",2));
    compucasarana.setMouse(new Mouse("logitech","XDDDD","gamer"));
   

    }
    
}
