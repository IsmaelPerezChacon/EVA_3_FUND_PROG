/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_retrun;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EVA3_13_RETRUN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        System.out.println("valor 1; ");
        int val1 = captu.nextInt();
        System.out.println("valor 2; ");
        int val2 = captu.nextInt();
        //llamar ala funcion
        int resu = sumar(val1, val2);
        System.out.println("la suma = " + resu);
        sumar(val1, val2);
        
    }
    public static void sumar(int num1, int num2){
        int resu = num1 + num2;
        
    }
    return
}
