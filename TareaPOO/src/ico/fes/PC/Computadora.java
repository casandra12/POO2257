/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.PC;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.CPU;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
/**
 *
 * @author cassm
 */
public class Computadora {

private String marca;
private String modelo;
private CPU cpu;
private Monitor monitor;
private Mouse mouse;
private Teclado Teclado;

    public Computadora() {
     
    }

    public Computadora(String marca, String modelo, CPU cpu, Monitor monitor, Mouse mouse, Teclado Teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cpu = cpu;
        this.monitor = monitor;
        this.mouse = mouse;
        this.Teclado = Teclado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Teclado getTeclado() {
        return Teclado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setTeclado(Teclado Teclado) {
        this.Teclado = Teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", cpu=" + cpu + ", monitor=" + monitor + ", mouse=" + mouse + ", Teclado=" + Teclado + '}';
    }
   
    }

    