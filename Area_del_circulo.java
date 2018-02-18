/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_del_circulo;

/**
 *
 * @author Johan Zambrano
 */
public class Area_del_circulo {

     /**
     *Calcula el area del circulo 
     * @version  1.8.0_161, 18/2/18
     * @autor Johan Zambrano
     */
    public static void main(String[] args) {
        double radio=2.2,area;
        System.out.println("\tAREA DEL CIRCULO\n");
        System.out.println("Formula = pi*r^2\n");
        System.out.println("Radio del circulo= "+radio);
        radio=Math.pow(radio, 2);
        area=(3.1416)*(radio);
        System.out.println("\nArea =  "+area);
    }   
}