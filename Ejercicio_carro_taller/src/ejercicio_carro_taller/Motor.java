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
public class Motor {
    private double Rendimiento;
    private double VelocidadNominal;
    private double potencia;
    private double ParMotor;

    public Motor(double Rendimiento, double VelocidadNominal, double potencia, double ParMotor) {
        this.Rendimiento = Rendimiento;
        this.VelocidadNominal = VelocidadNominal;
        this.potencia = potencia;
        this.ParMotor = ParMotor;
    }

    public double getRendimiento() {
        return Rendimiento;
    }

    public void setRendimiento(double Rendimiento) {
        this.Rendimiento = Rendimiento;
    }

    public double getVelocidadNominal() {
        return VelocidadNominal;
    }

    public void setVelocidadNominal(double VelocidadNominal) {
        this.VelocidadNominal = VelocidadNominal;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getParMotor() {
        return ParMotor;
    }

    public void setParMotor(double ParMotor) {
        this.ParMotor = ParMotor;
    }
    
    
}
