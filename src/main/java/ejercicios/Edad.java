package ejercicios;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        
        // Crear objeto LocalDate con la fecha de nacimiento proporcionada
        LocalDate fechaNacimiento = LocalDate.of(anno, mes, dia);
        
        // Calcular la diferencia entre la fecha actual y la fecha de nacimiento
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        
        // Obtener el número de años del periodo
        int edad = periodo.getYears();
        
        // Devolver la edad como cadena
        return "Usted tiene " + edad + " años";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
