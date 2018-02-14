/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogboarding;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class DogBoarding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pe=new Scanner(System.in);
        System.out.print("Inserte peso del perro ");
        int dog=pe.nextInt();
        System.out.print("Dias que se va a quedar ");
        int dia=pe.nextInt();
        double pes=.50;
        double cant=(dog*pes)*dia;
        System.out.printf("Precio total del embarque: %.2f\n", cant);
        
        // TODO code application logic here
    }
    
}
