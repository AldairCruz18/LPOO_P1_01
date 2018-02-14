/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticmethods2;

import java.util.Scanner;

/**
 *
 * @author Aldair Cruz
 */
public class ArithmeticMethods2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
       Methods am=new Methods();
        Scanner ew=new Scanner(System.in);
        System.out.print("Primer variable: ");
        am.a=ew.nextInt();
        System.out.print("Segunda variable: ");
        am.b=ew.nextInt();
        
        System.out.printf("números sumados mas 10: %d\n",am.displayNumberPlus10());
        System.out.printf("números sumados mas 100: %d\n",am.displayNumberPlus100());
        System.out.printf("números sumados mas 1000: %d\n",am.displayNumberPlus1000());
    }
    
}
