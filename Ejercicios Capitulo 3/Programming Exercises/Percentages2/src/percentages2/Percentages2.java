/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percentages2;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class Percentages2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a,b;
       Scanner ab=new Scanner(System.in);
         Percent pr=new Percent();
        a=ab.nextDouble();
        b=ab.nextDouble();
        pr.computePercent(a,b);
        System.out.printf("%.2f es %.2f porciento de %.2f\n",a, pr.computePercent(a,b),b);
    }
    
}
