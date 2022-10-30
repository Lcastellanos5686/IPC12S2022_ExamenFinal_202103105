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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           boolean salir = true;
        int opcion;
        Scanner sc = new Scanner(System.in);
        
        

        while (salir) {
            System.out.println("Eliga el numero de la opcion: \n \n 1.  \n 2.  \n 3.  \n 4. Salir");
            opcion = sc.nextInt();

            switch (opcion) {

                case (1):
                    System.out.println("Opcion 1");
                    break;
                case (2):
                    System.out.println("Opcion 2");
                    break;
                case (3):
                    System.out.println("Opcion 3");
                    break;

            }
            
            if(opcion==4){
                salir=false;
            }
        }

    }
    
}
