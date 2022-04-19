/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;
import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class Ejercicio_6 {

    /**
     *  Lee un número por teclado que pida el precio de un producto (puede 
tener decimales) y calcule el precio final con IVA. El IVA será una 
constante que será del 19%
     */
    public static void main(String[] args) {
        Scanner scn= new Scanner (System.in);
        double precio = scn.nextDouble();
        precio = (precio + precio *0.19);
       System.out.println("El precio final es: " + precio );
    }
    
}
