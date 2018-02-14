/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dollars;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class Dollars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dl=new Scanner(System.in);
        int dolla=dl.nextInt();
            if(dolla>=20){
               int a=dolla/20;
              int b=a*20;
              dolla=dolla-b;
              System.out.printf("Billetes de 20: %d\n",a);
              System.out.printf("%d\n",dolla);
            }
            if(dolla>=10 && dolla<=20){
                int d=dolla/10;
                int e=d*10;
                dolla=dolla-e;
                System.out.printf("Billetes de 10: %d\n",d);
              System.out.printf("%d\n",dolla);
            }
            if(dolla>=5 && dolla<=10){
                int f=dolla/5;
                int g=f*5;
                dolla=dolla-g;
                System.out.printf("Billetes de 5: %d\n",f);
              System.out.printf("%d\n",dolla);
            }
         if(dolla>=1 && dolla<=5){
                int h=dolla/1;
                int i=h*1;
                dolla=dolla-i;
                System.out.printf("Billetes de 1: %d\n",h);
              System.out.printf("%d\n",dolla);
            }
    }
    
}
