/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos años quieres verificar?: ");
        int cantidadAños = scanner.nextInt();
        
        int[] años = new int[cantidadAños];
        
       
        for (int i = 0; i < cantidadAños; i++) {
            System.out.print("Ingresa el año #" + (i + 1) + ": ");
            años[i] = scanner.nextInt();
        }
        
     
        for (int año : años) {
            if (esBisiesto(año)) {
                System.out.println(año + " es un año bisiesto.");
            } else {
                System.out.println(año + " no es un año bisiesto.");
            }
        }
    }
    
    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}