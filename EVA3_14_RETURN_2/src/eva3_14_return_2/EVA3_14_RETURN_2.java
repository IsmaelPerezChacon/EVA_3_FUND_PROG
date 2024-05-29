/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_return_2;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EVA3_14_RETURN_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        System.out.println("base; ");
        int base = captu.nextInt();
        System.out.println("potencia; ");
        int pot = captu.nextInt();
        int resu = calcularpor(base, pot);
        System.out.println("la suma = " + resu);
        calcularpor(base, por);
        
    }
    public static int calcularpor(int base, int potencia){
        //necitamos un acumulador
        //suma = suma + valor;
        //sum +-valor
        int resu = 1;
        for (int i = 0; i < potencia; i++) {
            resu = resu * base;
        }
        return
    }
}
