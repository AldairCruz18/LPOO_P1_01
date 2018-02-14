/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricconvertion;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class MetricConvertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int valor=sc.nextInt();
        Metodos m=new Metodos();
        m.pulgadas(valor);
        m.litros(valor);
        System.out.printf("Conversión de %d a pulgadas: %.2f\nConversión de %d a litros: %.2f\n",valor,m.pulgadas(valor),valor,m.litros(valor) );
        // TODO code application logic here
    }
    
}
