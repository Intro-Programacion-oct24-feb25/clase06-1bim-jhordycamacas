/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
   existe una modificacion en el proceso de la poblematica, el porcentaje de descuento del seguro sera
   ingresado por teclado. Considerar los valores posibles a ingresar son: entre 1 y 15, si la persona ingresa
   un valor fuera de esta rango el valor del porcentaje va a ser 10
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ComercioTres {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        
        String nombre;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;
        
        double productividad;
        double coeficiente = 0.6;
        double bono  = 0;
        
        double porcentajeSeguro;
        double adicionalSeguro;
        
        double sueldoFinal; 
        
        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();        
        
        System.out.println("Ingrese el porcentaje de seguro");
        porcentajeSeguro = entrada.nextDouble();
        
        System.out.println("Ingrese el número de productos vendidos "
                + "por favor");
        numeroProductos = entrada.nextInt();
        
        // calcular la productividad
        productividad = numeroProductos * coeficiente;
        
        if (productividad<=30){
            bono = 25; // $25
        }else{//condicionales anidados RECORDAR
            if (productividad>=31 && productividad<80){
                bono = 50;
            }else{
                if (productividad>=80 && productividad < 200) {
                    bono = 100;
                }else{
                    if(productividad >= 200){
                        bono = 200;
                    }
                }
            }
        }
       /* if (porcentajeSeguro >=1 && porcentajeSeguro <= 15){
           
        }else{ 
            porcentajeSeguro = 10;
            
                    }
        /*Esta fue mi solucion en un principio e igual funciona, puesto que 
        se calcula el adicionalSeguro directamente con el porcentajeSeguro
        ingresado siempre y cuando la condicion se cumpla caso contrario el 
        porcentajeSeguro sera 10 y con ese dato se calcula el adicionalSeguro
        */
        /* opción 1
        if (porcentajeSeguro >= 1 && porcentajeSeguro <= 15) {
            porcentajeSeguro = porcentajeSeguro + 0;
        } else {
            porcentajeSeguro = 10;
        }
        Esta solucion igualmente es valida, siempre y cuando al final de la condicion
        se haga el calculo de adicionalSeguro, ademas que al sumar porcentajeSeguro mas 0
        no cambia el valor ingresado siempre y cuando se cumpla la condicion, caso contrario
        valdra 10
       */
        
        /*opción 2
        if (porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        }
        Esta opcion no funciona puesto que el rango no esta bien describido
        */
         /* opción 3
        if (porcentajeSeguro < 1 || porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        }
        Esta solucion si funciona puesto que si toma en cuenta los valores dentro del rnago
        esto debido al or puesto que si fuera and no funcionaria
        */  
          // opción 4
        if (porcentajeSeguro < 1 && porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        }
        
        adicionalSeguro = (sueldoBasico * porcentajeSeguro)/100;
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;
        
        System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Sueldo: $%.2f\n"
                + "Número de productos vendidos: %d\n"
                + "\tProductidad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n", 
                nombre, 
                apellido,
                edad,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);
        
        
    }
    
}
