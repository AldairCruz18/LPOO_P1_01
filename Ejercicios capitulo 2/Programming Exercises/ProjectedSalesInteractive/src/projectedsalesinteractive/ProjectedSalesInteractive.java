/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectedsalesinteractive;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class ProjectedSalesInteractive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        float Perce=(float).10,a,b;
        float sur,norte;
        a=ab.nextFloat();
        b=ab.nextFloat();
        
        System.out.printf("El estado del sur tendra un incremento de %.2f y el norte un incremento de %.2f en realcion a sus ventas\n", a*Perce,b*Perce);
    
}
}