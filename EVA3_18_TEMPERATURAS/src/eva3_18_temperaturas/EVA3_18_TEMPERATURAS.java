/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_18_temperaturas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_18_TEMPERATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la temperatura en Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
                    break;
                case 2:
                    System.out.print("Ingresa la temperatura en Fahrenheit: ");
                    double fahrenheit2 = scanner.nextDouble();
                    double celsius2 = fahrenheitToCelsius(fahrenheit2);
                    System.out.println("La temperatura en Celsius es: " + celsius2);
                    break;
                case 3:
                    System.out.print("Ingresa la temperatura en Celsius: ");
                    double celsius3 = scanner.nextDouble();
                    double kelvin = celsiusToKelvin(celsius3);
                    System.out.println("La temperatura en Kelvin es: " + kelvin);
                    break;
                case 4:
                    System.out.print("Ingresa la temperatura en Kelvin: ");
                    double kelvin2 = scanner.nextDouble();
                    double celsius4 = kelvinToCelsius(kelvin2);
                    System.out.println("La temperatura en Celsius es: " + celsius4);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
            
        } while (opcion != 5);
        
        scanner.close();
    }
    
    public static void mostrarMenu() {
        System.out.println("Selecciona una opción:");
        System.out.println("1. Convertir de Celsius a Fahrenheit");
        System.out.println("2. Convertir de Fahrenheit a Celsius");
        System.out.println("3. Convertir de Celsius a Kelvin");
        System.out.println("4. Convertir de Kelvin a Celsius");
        System.out.println("5. Salir");
        System.out.print("Opción: ");
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
