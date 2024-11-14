/*
*   Generar un programa que permita ingresar un nombre de una ciudad;
*   Los nombres de las ciudades permitidas son las que empiezan con vocal.
*   Si la ciudad es permitida presentar un mensaje:
*   Nombre con inicial O de otavalo
*   Si la ciudad no es permitida presentar un mensaje:
*   opción incorrecta; ninguna de las anteriores
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre de una ciudad del Ecuador");
        String nombre = entrada.nextLine();
        nombre = nombre.toLowerCase();
        // nombre = "atacames"
        char valor = nombre.charAt(0); // obtener el primer caracter de una
        String inicial = nombre.substring(0,1);/*como debemos imprimir la inical en mayuscula nos ayudamos de una nueva variable
        en este caso con un substring para que tome la inicial, despues imprimimos junto con un toUpperCase, para que 
        la inicial se imprima en mayusculas*/
        // cadena
        //  L   o   j   a
        //  0   1   2   3
        switch(valor){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                /*Se coloco los case asi para faciliatr el manejo, ademas de que es una forma mas facil de colocarlo
                sin embargo hay q tomar en cuenta q la inicial debe ser presentada en mayusculas
                */
                System.out.printf("Nombre con inicial %s de %s\n", 
                        inicial.toUpperCase(),
                        nombre.toLowerCase());
                break;
           
                default:
                System.out.println("opción incorrecta; ninguna de las "
                        + "anteriores");
                break;
                
        }
        
    }
}
