/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_sumatoria;

import java.util.Scanner;

/**
 *
 * @author Ismael Perez
 */
public class EVA3_15_SUMATORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
        
   System.out.print("Ingrese el número hasta el cual desea calcular la sumatoria: ");
        int numero = scanner.nextInt();
        
        int resultado = calcularSumatoria(numero);
        System.out.println("La sumatoria es: " + resultado);
        
    }
    public static int calcularSumatoria(int limiteSuperior) {
        int sumatoria = 0;
        for (int i = 1; i <= limiteSuperior; i++) {
            sumatoria += i;
        }
        return sumatoria;
    }
}
