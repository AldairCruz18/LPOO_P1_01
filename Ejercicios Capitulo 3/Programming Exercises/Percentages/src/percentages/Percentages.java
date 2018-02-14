/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percentages;

/**
 *
 * @author Aldair Cruz
 */
public class Percentages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b;
         Percent pr=new Percent();
        a=2;
        b=5;
        pr.computePercent(a,b);
        System.out.printf("%.2f es %.2f porciento de %.2f\n",a, pr.computePercent(a,b),a);
        pr.computePercent(a,b);
         System.out.printf("%.2f es %.2f porciento de %.2f\n",b, pr.computePercent(b,a),a);
    }
    
}
