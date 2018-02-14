/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheittocelsius;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class FahrenheitToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner fa=new Scanner(System.in);
        double c1;
        double far=fa.nextInt();
        c1=((far-32)*(0.5555555556));
        System.out.printf("Farenheit: %.2f\nCelsius: %.2f\n", far,c1);
        // TODO code application logic here
    }
    
}
