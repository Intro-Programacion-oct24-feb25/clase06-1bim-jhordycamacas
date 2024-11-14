/*

ANA DIAZ con edad 19, es estudiante de UTPL

luis vera con edad 19, es estudiante de UNL

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String apellido;
        String nombre;
        int edad;
        String universidad;
        
        
        System.out.println("Ingrese el nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre de la Universidad");
        universidad = entrada.nextLine();
        nombre = nombre.toLowerCase();
        
        char valor = nombre.charAt(0);
        
           
        switch(valor){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("%s %s con edad %d, es estudiante de %s\n", 
                        nombre.toUpperCase(),
                        apellido.toUpperCase(),
                        edad,
                        universidad);
                break;
            
            default:
                System.out.printf("%s %s con edad %d, es estudiante de %s\n", 
                        nombre.toLowerCase(),
                        apellido.toLowerCase(),
                        edad,
                        universidad);
                break;
                
        }
        
    }
}
