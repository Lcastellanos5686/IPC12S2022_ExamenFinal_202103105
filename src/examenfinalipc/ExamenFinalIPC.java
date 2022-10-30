/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinalipc;

import java.util.Scanner;

/**
 *
 * @author Luisda
 */
public class ExamenFinalIPC {
    
    public static void ImprimePiramide(int NumFilas){
        
        for (int i = 0; i < NumFilas; i++) {
            for (int j = 0; j < (NumFilas-i); j++) {
                System.out.print(" ");
               
            }
            
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir = true;
        boolean impar = true;

        int opcion;
        int num1;
        int num2;
        int numPiramide=0;
        int contador=1;
        int numImpar=1;
        

        Scanner sc = new Scanner(System.in);

        while (salir) {
            System.out.println("Eliga el numero de la opcion: \n \n 1. Ejercicio 1 (Comparacion de numeros)  \n 2. Ejercicio 2 (Creacion de piramides)  \n 3.  \n 4. Salir");
            opcion = sc.nextInt();

            switch (opcion) {

                case (1):
                    System.out.println("Elija el numero 1");

                    num1 = sc.nextInt();
                    System.out.println("Elija el numero 2");
                    num2 = sc.nextInt();

                    if (num1 > num2) {
                        System.out.println("El primer numero ingresado (" + num1 + ") es mayor que el segundo numero ingresado (" + num2 + ")");
                    } else if (num1 < num2) {
                        System.out.println("El primer numero ingresado (" + num1 + ") es menor que el segundo numero ingresado (" + num2 + ")");
                    } else if (num1 == num2) {
                        System.out.println("Los dos numeros son iguales");
                    }
                    System.out.println("Presione enter para continuar");
                    sc.nextLine();
                    sc.nextLine();

                    break;
                case (2):

                    while (impar) {
                        System.out.println("Ingrese el numero para la piramide");
                        numPiramide = sc.nextInt();
                        if (numPiramide % 2 == 0) {
                            System.out.println("El numero debe ser impar");
                            System.out.println("Presione enter para continuar");
                            sc.nextLine();
                            sc.nextLine();
                        }
                        else{
                            impar=false;
                        }
                    }
                    impar=true;
                    
                    while(numImpar!=numPiramide){
                        numImpar=numImpar+2;
                        contador++;
                    }
                    ImprimePiramide(contador);
                    
                    

                    break;
                case (3):
                    System.out.println("Opcion 3");
                    break;

            }

            if (opcion == 4) {
                salir = false;
            }
        }

    }

}
