package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {
    public static String evaluar(int peso, double estatura, int edad) {
        // Calcular el IMC
        double imc = peso / (estatura * estatura);
        
        // Determinar la categoría de peso según el IMC
        String categoria = "";
        if (imc < 18.5) {
            categoria = "bajo peso";
        } else if (imc < 25) {
            categoria = "normal";
        } else if (imc < 30) {
            categoria = "sobrepeso";
        } else {
            categoria = "obesidad";
        }
        
        // Devolver el resultado como cadena
        return "Su IMC es " + imc + ", lo que indica " + categoria;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();
        
        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}
