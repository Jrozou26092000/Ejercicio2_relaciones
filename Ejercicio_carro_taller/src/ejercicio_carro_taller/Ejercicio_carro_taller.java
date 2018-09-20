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
public class Ejercicio_carro_taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("----------Ingrese los datos de la persona------------");
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Años: ");
        int annios = leer.nextInt();
        System.out.println("Numero de cedula: ");
        int cedula = leer.nextInt();
        System.out.println("Dia de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Año de nacimiento: ");
        int annio = leer.nextInt();
        Fecha fnacimiento = new Fecha(dia,mes,annio);
        //--------------------------------------------
        System.out.println("Cuantos carros tiene: ");
        int contador = leer.nextInt();
        if(contador == 1){
        LLantas[] llantas = new LLantas[4];
        System.out.println("----------------Datos de las llantas-------------");
        System.out.println("Fabricante: ");
        String fabricante = leer.next();
        System.out.println("Ancho: ");
        double ancho = leer.nextDouble();
        System.out.println("Diametro del Rin: ");
        double diametro = leer.nextDouble();
        System.out.println("Indice de Carga: ");
        int carga = leer.nextInt();
        System.out.println("Indice de velocidad: ");
        String velocidad = leer.next();
        for(int i = 0; i <4; i++){
            llantas[i] = new LLantas(fabricante,ancho,diametro,carga,velocidad);
        }
        
        System.out.println("---------------Datos del motor----------------");
        System.out.println("Rendimiento: ");
        double rendimiento = leer.nextDouble();
        System.out.println("Velocidad Nominal: ");
        double velocidad_nominal = leer.nextDouble();
        System.out.println("Potencia: ");
        double potencia = leer.nextDouble();
        System.out.println("Par Motor: ");
        double par_motor = leer.nextDouble();
        Motor motor = new Motor(rendimiento,velocidad_nominal,potencia,par_motor);
        Carro[] carro = new Carro[1];
        carro[1] = new Carro(llantas,motor);
        Persona persona = new  Persona(nombre,annios,cedula,fnacimiento,carro);
        }else if(contador == 2){
            for (int i = 0; i < 2; i++) {
                LLantas[] llantas = new LLantas[4];
        System.out.println("----------------Datos de las llantas-------------");
        System.out.println("Fabricante: ");
        String fabricante = leer.next();
        System.out.println("Ancho: ");
        double ancho = leer.nextDouble();
        System.out.println("Diametro del Rin: ");
        double diametro = leer.nextDouble();
        System.out.println("Indice de Carga: ");
        int carga = leer.nextInt();
        System.out.println("Indice de velocidad: ");
        String velocidad = leer.next();
        for(int j = 0; j <4; j++){
            llantas[j] = new LLantas(fabricante,ancho,diametro,carga,velocidad);
        }
        
        System.out.println("---------------Datos del motor----------------");
        System.out.println("Rendimiento: ");
        double rendimiento = leer.nextDouble();
        System.out.println("Velocidad Nominal: ");
        double velocidad_nominal = leer.nextDouble();
        System.out.println("Potencia: ");
        double potencia = leer.nextDouble();
        System.out.println("Par Motor: ");
        double par_motor = leer.nextDouble();
        Motor motor = new Motor(rendimiento,velocidad_nominal,potencia,par_motor);  
        Carro[] carro = new Carro[2];
                for (int j = 0; j < 2; j++) {
                    carro[i] = new Carro(llantas,motor);
                }
        Persona persona = new  Persona(nombre,annios,cedula,fnacimiento,carro);
            }
        }
    }
    
}
