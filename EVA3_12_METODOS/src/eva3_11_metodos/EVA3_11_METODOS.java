/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_metodos;

/**
 *
 * @author Jennis
 */
public class EVA3_11_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarMensaje("Hola que hace");
        MostrarVarios("Hola que hace",5);
    }
    //Void =======D (tipo de dato) valor que representa el metodos
    //void =========D no regresa nada
    // nombre del metodo =====D identificador valido
    //          empezar en minusculas, deber ser un verbo
    // () D======== parametros del metodo )argumentos) ===D valores que necesita
    public static void mostrarMensaje(String mensaje){
        //// cuerpo del metodo: aqui va nuestro código
        System.out.println(mensaje);
    }
    
    public static void MostrarVarios(String mensaj, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaj);
            
        }
        
    }
            
 }
