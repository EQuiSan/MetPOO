package salario;

import java.util.Scanner;

public class Salario {
   
    public static void main(String[]args){

        String codigo;
        String nombre;
        String apellido;
        double salariomensual;
        double salariodiario;

        Scanner entrada= new Scanner(System.in);

        System.out.println("Ingrese el codigo del empleado");
        codigo=entrada.nextLine();

        System.out.println("Ingrese el nombre del empleado");
        nombre=entrada.nextLine();
        
        System.out.println("Ingrese el apellido del empleado");
        apellido=entrada.nextLine();

        System.out.println("Ingrese el salario mensual del empleado en $");
        salariomensual=entrada.nextDouble();
        
        if(salariomensual>0){
            salariodiario= salariomensual/30;
            System.out.println("El Salario diario del Empleado es: $"+salariodiario);
        }else{
            System.out.println("Cantidad invalida");
        }

        
    }
}