/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_foreach;

/**
 *
 * @author Jennis
 */
public class EVA3_10_ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diasSemana[] = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        for(String string : diasSemana){
            System.out.println(string);
            
        }
        int salario[] ={100, 200, 2500,450,3500,4000,16000};
        for(int cant: salario){
            System.out.println("$" + cant);
        }
        //imprimir mess del año con FOR EACH
        String mesesDelaño[] = {"Enero","febrero","marzo","abril","mayo","junio","julio","agosto",
        "septiembre","octubre","noviembre","diciembre"};
        for(String string : mesesDelaño){
        System.out.println(string);
    }
    }
    
}
