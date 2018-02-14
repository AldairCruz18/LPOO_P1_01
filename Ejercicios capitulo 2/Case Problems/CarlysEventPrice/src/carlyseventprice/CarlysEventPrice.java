
package carlyseventprice;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class CarlysEventPrice {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("¿Cual es la cantidad de usuarios que asistiran a la fiesta?  ");
        int inv=in.nextInt();
        int h=35;
        int t=inv*h;
        
        System.out.println("*************************************************");
        System.out.println("* Carly’s makes the food that makes it a party. *");
        System.out.println("*************************************************");
        
        System.out.printf("Invitados: %d\nPrecio por huesped: %d\nPrecio total: %d\n",inv,h,t);
        if(inv>=50)
            System.out.println("Verdadero, hay más de 50 invitados");
        else
            System.out.println("Falso, hay menos de 50 invitados");
        
    }
    
}
