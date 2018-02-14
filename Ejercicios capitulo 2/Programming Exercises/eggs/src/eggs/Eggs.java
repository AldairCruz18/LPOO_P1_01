/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggs;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class Eggs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Huevos a pedir  ");
        int huev=a.nextInt();
        int c=huev/12;
        int d=12*c;
        int e=huev-d;
        double f=((c*3.25)+(e*0.45));
        System.out.printf("ordenaste %d huevos. Esas son %d docenas y %d unidades, lo que da un precio de %.2f\n",huev,c,e,f);
       
    }
    
}
