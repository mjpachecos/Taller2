/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;
import java.util.Scanner;

/**
 *
 * @author Juliana
 */
public class FoodCo {

    public static void main(String[] args) 
    {
        int opcion[]= new int [5];
        boolean menu = true;
        while(menu==true ){
        System.out.println("FOOD-CO\n");
        System.out.println("Ingrese uno de los numeros correspondientes a las opciones:");
        System.out.println("1. Personal");
        System.out.println("2. Cliente");
        System.out.println("3. Campaña");
        System.out.println("4. Fabrica");
        System.out.println("5. Marca");
        
        Scanner leer = new Scanner(System.in);
        opcion[0] = leer.nextInt();
        switch(opcion[0])
        {
            case 1: System.out.println("PERSONAL");
                    System.out.println("Ingrese uno de los numeros correspondientes a las opciones:");
                    System.out.println("1. Agregar personal ");
                    System.out.println("2. Eliminar personal ");
                    System.out.println("3. Revisar Personal");
                    System.out.println("4. Mostrar numero e trabajadores ");
                    opcion[1] = leer.nextInt();
                    switch(opcion[0])
                    {
                        case 1 : System.out.println("AGREGAR PERSONAL");
                                 System.out.println("Ingrese nombre: ");
                    }
                    break;
            case 2: System.out.println("CLIENTE");
                    System.out.println("Ingrese uno de los numeros correspondientes a las opciones:");
                    System.out.println("1. Agregar cliente");
                    System.out.println("2. Eliminar cliente");
                    System.out.println("3. Modificar cliente");
                    System.out.println("4. Mostrar clientes");
                    opcion[1] = leer.nextInt();
                    switch(opcion[0])
                    {
                        case 1 : 
                    }
                    break;
            case 3: System.out.println("CAMPAÑA");
                    System.out.println("Ingrese uno de los numeros correspondientes a las opciones:");
                    System.out.println("1. Agregar campaña");
                    System.out.println("2. Eliminar campaña");
                    System.out.println("3. Mostrar campañas");
                    opcion[1] = leer.nextInt();
                    switch(opcion[0])
                    {
                        case 1 : 
                    }
                    break;
            case 4: System.out.println("FABRICA");
                    System.out.println("Ingrese uno de los numeros correspondientes a las opciones:");
                    System.out.println("1. Agregar fabrica");
                    System.out.println("2. Agregar productos a una fabrica");
                    System.out.println("3. Eliminar fabrica ");
                    System.out.println("4. Eliminar producto");
                    opcion[1] = leer.nextInt();
                    switch(opcion[0])
                    {
                        case 1 : 
                    }
                    break;
        }
       
    }
    
}}
