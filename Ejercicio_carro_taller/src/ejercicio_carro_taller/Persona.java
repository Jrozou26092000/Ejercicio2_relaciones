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
public class Persona {
    private Carro[] carro;
    private Fecha fnacimiento;
    private String nombre;
    private int annios;
    private long cedula;

    public Persona(String nombre, int annios, long cedula,Fecha fnacimiento,Carro[] carro) {
        for (int i = 1; i <= 2; i++) {
            this.carro = carro;
        }
        this.fnacimiento = fnacimiento;
        this.nombre = nombre;
        this.annios = annios;
        this.cedula = cedula;
    }

    public Carro[] getCarro() {
        return carro;
    }

    public void setCarro(Carro[] carro) {
        this.carro = carro;
    }

    public Fecha getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Fecha fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnnios() {
        return annios;
    }

    public void setAnnios(int annios) {
        this.annios = annios;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }
    
    
    
    
         
    
}
