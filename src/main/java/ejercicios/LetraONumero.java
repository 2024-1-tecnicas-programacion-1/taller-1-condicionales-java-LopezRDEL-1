package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        // Verificar si el carácter es una letra
        if (Character.isLetter(caracter)) {
            return "Es letra";
        }
        // Verificar si el carácter es un número
        else if (Character.isDigit(caracter)) {
            return "Es número";
        }
        // Si no es ni letra ni número, es un carácter especial
        else {
            return "Es caracter especial";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
