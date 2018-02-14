
package sammysrentalprice;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class SammysRentalPrice {

    
    public static void main(String[] args) {
        int total,a = 0,b;
        int parc1 = 0,parc2 = 0;
        Scanner pr=new Scanner(System.in);
        System.out.print("Cantidad de minutos de la renta    ");
        int re=pr.nextInt();
        if(re>=60){
           a=re/60;
           b=a*60;
           re=re-b;
           parc1=a*40;
          // System.out.printf("Horas: %d\nGG:%d \nResto: %d", a,b,re);
        }
            parc2=re;
        total=parc2+parc1;
        
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy’s makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        
        System.out.printf("\nHoras: %d\nMinutos:%d \nTotal a pagar: %d\n", a,re,total);
        // TODO code application logic here
    }
    
}
