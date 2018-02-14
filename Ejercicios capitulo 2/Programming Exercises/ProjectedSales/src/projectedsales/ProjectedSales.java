/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectedsales;

/**
 *
 * @author Aldair Cruz
 */
public class ProjectedSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float Perce=(float).10,a,b;
        float sur=560,norte=823;
        a=sur*Perce;
        b=norte*Perce;
        System.out.printf("El estado del sur tendra un incremento de %.2f y el norte un incremento de %.2f en realcion a sus ventas\n", a,b);
        
        
        // TODO code application logic here
    }
    
}
