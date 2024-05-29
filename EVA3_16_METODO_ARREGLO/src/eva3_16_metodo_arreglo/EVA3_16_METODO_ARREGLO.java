/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_16_metodo_arreglo;

/**
 *
 * @author juani
 */
public class EVA3_16_METODO_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] datos = new int [10];
        datos = llanar(datos);
        imprimir(datos);
        System.out.println("");
        int [] datos2 = new int [15];
        datos2 = llenar(datos2);
        imprimir(datos2);
            
        
    }
    public static void imprimir(int[]arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + ")");
            
        }
    }
    public static int[] llanar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()* 100);
        
    }
    return arreglo;        
}
}