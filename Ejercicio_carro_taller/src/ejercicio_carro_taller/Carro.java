/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_carro_taller;

/**
 *
 * @author Juanes
 */
import java.util.Scanner;
public class Carro {
    private LLantas[] llantas;
    private Motor motor;
    private Chasis chasis;

    public Carro(LLantas[] llantas, Motor motor) {
        this.llantas = llantas;
        this.motor = motor;
        System.out.println("---------Datos del Chasis------------");
        Scanner leer= new Scanner (System.in);
        System.out.println("Tipo de chasis: ");
        String tipo = leer.next();
        this.chasis = new Chasis(tipo);
    }
    
    public LLantas[] getLlantas() {
        return llantas;
    }

    public void setLlantas(LLantas[] llantas) {
        this.llantas = llantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }
    
    
}
