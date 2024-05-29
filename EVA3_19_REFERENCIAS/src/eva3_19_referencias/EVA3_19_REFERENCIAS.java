/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_19_referencias;

/**
 *
 * @author Ismael Perez
 */
public class EVA3_19_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int [] arreglo = new int [5];
        System.out.println(arreglo);
        int x = 100;
        System.out.println("Antes de llamar al metodo. x = " + x);
        
        sumarUno(x);//Le estoy enviando una copia de la x
        System.out.println("Despues de llamar al método. x = " + x);
        System.out.println("------------");
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
        System.out.println("");
        modificarArreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo [i] + "]");
        }
    }
    
    public static void sumarUno (int valor){
        System.out.println("Antes de la operacion. Valor: " + valor);
        valor = valor + 1;
        System.out.println("Despues de la operacion. Valor: " + valor);
    }
    public static void modificarArreglo (int [] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random() * 100);
    }
}
}