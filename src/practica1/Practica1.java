/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author rafael.meza
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        while(!salir){
            System.out.println("1. Nueva Partida");
            System.out.println("2. Salir");
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1: System.out.println("1. Nombre de Usuario");
                        System.out.println("2. Tamaño del Tablero");
                break;
                case 2: salir = true;
                break;
                default: System.out.println("Seleccione 1 o 2 para continuar");
            }
        }
    }
    
}
