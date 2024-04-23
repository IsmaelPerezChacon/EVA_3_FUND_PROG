/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_indice_erroneo;

/**
 *
 * @author Jennis
 */
public class EVA3_3_INDICE_ERRONEO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int datos[] = new int [10];
        datos[10] = 100; //error en tiempo de ejecucion: el indice 10 no existe
        System.out.println("El valor en datos es[10]" + datos[10]);
    }
    
}
