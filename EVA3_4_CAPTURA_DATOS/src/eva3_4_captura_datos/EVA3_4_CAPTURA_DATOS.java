/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_captura_datos;

import java.util.Scanner;

/**
 *
 * @author Jennis
 */
public class EVA3_4_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cuantos nombres vas a capturar?");
        cant = captu.nextInt();
        String[] listaNombres = new String[cant];
        captu.nextLine();
        //HAY QUE PREGUNTAR CADA/TODOS LOS NOMBRES:
        for(int i =0; i < listaNombres.length; i++){
            System.out.println("Nombre #"+ (i + 1)+":");
            listaNombres[i] = captu.nextLine();
            
        }
        for(int i =0; i < listaNombres.length; i++){
          System.out.println("Nombre #"+ (i + 1)+":");
            System.out.print(listaNombres[i]);
          
        }
            
    }
    
}
