/*
Ingrese fecha de nacimiento

Dia: 7
Mes: 2
Año: 1980

salida

Usted ha nacido el 7 de febrero de 1980
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int dia;
        int mes;
        int year;
       
        
        System.out.println("Ingrese el dia de nacimiento");
        dia = entrada.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        mes = entrada.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        year = entrada.nextInt();
        String nombremes = "";
        
        switch (mes) {
            case 1:
                nombremes = "ENERO";
                break;
                
            case 2:
                nombremes = "FEBRERO";
                break;
                
            case 3:
                nombremes = "MARZO";
                break;
                
            case 4:
                nombremes = "ABRIL";
                break;
                
            case 5:
                nombremes = "MAYO";
                break;
                
            case 6:
                nombremes = "JUNIO";
                break;
                
            case 7:
                nombremes = "JULIO";
                break;
                
            case 8:
                nombremes = "AGOSTO";
                break;
                
            case 9:
                nombremes = "SEPTIEMBRE";
                break;
                
            case 10:
                nombremes = "OCTUBRE";
                break;
                        
            case 11:
                nombremes = "NOVIEMBRE";
                break;
                        
            case 12:
                nombremes = "DICIEMBRE";
                break;
                        
            default:
                System.out.println("Numero de mes incorrecto");
        }
        System.out.printf("Usted ha nacido el %d de %s de %d\n",
                dia,
                nombremes,
                year);

    }
}
