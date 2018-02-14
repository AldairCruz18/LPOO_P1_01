
package arithmeticmethods;

/**
 *
 * @author Aldair Cruz
 */
public class ArithmeticMethods {

   
    public static void main(String[] args) {
        int a,b;
       Methods am=new Methods();
       
        am.a=14;
        am.b=19;
        
        System.out.printf("números sumados mas 10: %d\n",am.displayNumberPlus10());
        System.out.printf("números sumados mas 100: %d\n",am.displayNumberPlus100());
        System.out.printf("números sumados mas 1000: %d\n",am.displayNumberPlus1000());
    }
}
    
    

