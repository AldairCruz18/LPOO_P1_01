/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasprices;

/**
 *
 * @author Aldair Cruz
 */
public class Gas {
    private double b1;
    private double c1;
    public double b;
    public double c;
    public void GasRango(Integer a){
        b=a/(28.57142857);
        c=a/25.00;
    }
    public double ObtenerRango1(){
        
        return b;
    }
    public double ObtenerRango2(){
        
        return c;
    }
}
