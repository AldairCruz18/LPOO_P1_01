/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inchestofeetinteractive;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class InchesToFeetInteractive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner ab=new Scanner(System.in);
     float pulgadas;
    float conv;
    pulgadas=ab.nextFloat();
    conv=(float) (pulgadas/(11.94444444));
    System.out.printf("Pulgadas: %.2f\nPies: %f\n",pulgadas,conv);
        // TODO code application logic here
    }
    
}
