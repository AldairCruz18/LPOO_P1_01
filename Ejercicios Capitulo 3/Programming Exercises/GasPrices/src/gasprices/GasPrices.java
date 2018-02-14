/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasprices;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class GasPrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        int pricePerBarrel;
        pricePerBarrel=sd.nextInt();
        Gas g=new Gas();
        g.GasRango(pricePerBarrel);
        System.out.printf("Entre %.2f y %.2f\n",g.ObtenerRango1(),g.ObtenerRango2());
        
        // TODO code application logic here
    }
    
}
