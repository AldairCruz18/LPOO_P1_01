/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestofeetinteractive;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class MilesToFeetInteractive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        float FeetToMiles=5280,dis;
        dis=ab.nextFloat();
        System.out.printf("La distancia de mi casa a la de mi tio es de %.2f millas o %.2f pies\n", dis,FeetToMiles*dis);
    }
    
}
