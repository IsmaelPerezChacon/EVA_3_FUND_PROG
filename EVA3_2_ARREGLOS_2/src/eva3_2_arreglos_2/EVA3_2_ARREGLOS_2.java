/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos_2;

/**
 *
 * @author Jennis
 */
public class EVA3_2_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //java: 0 primer elemento
        //n-1 ultimo elemento
        // N ----------D TOTAL DE ELEMENTOS ALMACENADOS EN EL ARREGLO
        
        //vamos a crear un arreglo y llenarlo de valores aleatorios.
        //int datos[] , x,y; --------D SOLO datos ES UN ARREGLO
        //int [] datos, x ,y; ----------D TODAS LAS VARIABLES SON ARREGLOS
        int datos[] = new int [10];
        
        //asignar valores aleatorios entre 0 y 99
        for (int i = 0; i < datos.length; i++){ //los for estan diseñados para los arreglos
        datos[i] = (int)(Math.random()* 100); // genera 0-99
        
           
        
        }
        //imprimir los elemntos del arreglo
        for (int i = 0; i < datos.length; i++){
            System.out.print("["+ datos[i]+"]");
        }
    }
    
}
