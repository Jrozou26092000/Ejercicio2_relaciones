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
    
    public void ListaCarros(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos carros tiene: ");
        int numero_carros = leer.nextInt();
        if(numero_carros == 1){
            System.out.println("---------Informacion llantas----------");
            LLantas[] llantas = this.carro[1].getLlantas();
            System.out.println("Fabricante llantas: "+llantas[1].getFabricante());
            System.out.println("Ancho de las llantas: "+llantas[1].getAncho());
            System.out.println("Daimetro del Rin: "+llantas[1].getDiametroRin());
            System.out.println("Indice de carga: "+llantas[1].getIndiceCarga());
            System.out.println("Indice de velocidad: "+llantas[1].getIndiceVelocidad());
            System.out.println("---------Informacion del motor--------");
            System.out.println("Rendimineto: "+this.carro[1].getMotor().getRendimiento());
            System.out.println("Velocidad Nominal: "+this.carro[1].getMotor().getVelocidadNominal());
            System.out.println("Potencia: "+this.carro[1].getMotor().getPotencia());
            System.out.println("Par motor: "+this.carro[1].getMotor().getParMotor());
            System.out.println("---------Informacion chasis-----------");
            System.out.println("Tipo de chasis: "+this.carro[1].getChasis().getTipo());
        }else if(numero_carros == 2){
            for(int i = 0; i < 2 ;i++){
                System.out.println("------------------CARRO "+(i+1)+"-------------------");
                System.out.println("---------Informacion llantas----------");
                LLantas[] llantas = this.carro[i].getLlantas();
                System.out.println("Fabricante llantas: "+llantas[1].getFabricante());
                System.out.println("Ancho de las llantas: "+llantas[1].getAncho());
                System.out.println("Daimetro del Rin: "+llantas[1].getDiametroRin());
                System.out.println("Indice de carga: "+llantas[1].getIndiceCarga());
                System.out.println("Indice de velocidad: "+llantas[1].getIndiceVelocidad());
                System.out.println("---------Informacion del motor--------");
                System.out.println("Rendimineto: "+this.carro[i].getMotor().getRendimiento());
                System.out.println("Velocidad Nominal: "+this.carro[i].getMotor().getVelocidadNominal());
                System.out.println("Potencia: "+this.carro[i].getMotor().getPotencia());
                System.out.println("Par motor: "+this.carro[i].getMotor().getParMotor());
                System.out.println("---------Informacion chasis-----------");
                System.out.println("Tipo de chasis: "+this.carro[1].getChasis().getTipo());
            }
        }
        
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
