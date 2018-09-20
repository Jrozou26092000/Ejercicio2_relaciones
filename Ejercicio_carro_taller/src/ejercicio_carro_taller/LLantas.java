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
public class LLantas {
    private String fabricante;
    private double Ancho;
    private double DiametroRin;
    private int IndiceCarga;
    private String IndiceVelocidad;

    public LLantas(String fabricante, double Ancho, double DiametroRin, int IndiceCarga, String IndiceVelocidad) {
        this.fabricante = fabricante;
        this.Ancho = Ancho;
        this.DiametroRin = DiametroRin;
        this.IndiceCarga = IndiceCarga;
        this.IndiceVelocidad = IndiceVelocidad;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public double getDiametroRin() {
        return DiametroRin;
    }

    public void setDiametroRin(double DiametroRin) {
        this.DiametroRin = DiametroRin;
    }

    public int getIndiceCarga() {
        return IndiceCarga;
    }

    public void setIndiceCarga(int IndiceCarga) {
        this.IndiceCarga = IndiceCarga;
    }

    public String getIndiceVelocidad() {
        return IndiceVelocidad;
    }

    public void setIndiceVelocidad(String IndiceVelocidad) {
        this.IndiceVelocidad = IndiceVelocidad;
    }
    
    
}
