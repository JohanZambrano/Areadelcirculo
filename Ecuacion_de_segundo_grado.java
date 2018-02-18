/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacion_de_segundo_grado;

/**
 *
 * @author Johan Zambrano
 */
public class Ecuacion_de_segundo_grado {

    /**
     * Calcula una ecuacion de segundo grado
     * @version  1.8.0_161, 18/2/18
     * @autor Johan Zambrano
     */
    public static void main(String[] args) {
        float a=2,b=-7,c=3,raiz,sol1,sol2;
        System.out.println("\tEcuación de segundo grado\n");
        if(a==0){
        System.out.println("Recuerde que a es el coeficiente cuadrático (distinto de 0)");
        }else{
            System.out.println(a+"x^2 + "+b+"x +"+c+" = 0\n\n");
            b=b*-1;
            raiz=(b*b)-4*a*c;
            System.out.println("       "+b+" +- raiz(" +b+"^2 - 4("+a+")("+c+"))");
            System.out.println("x  =  ------------------------------------");
            System.out.println("            "+2*a+"             \n\n");
            System.out.println("       "+b+" +- raiz(" + raiz+" )");
            System.out.println("x  =  --------------------");
            System.out.println("            "+2*a+"             \n\n");
            raiz=(float) Math.sqrt(raiz);
            System.out.println("       "+b+" +- " + raiz);
            System.out.println("x  =  --------------------");
            System.out.println("            "+2*a+"             ");
            sol1=(b-raiz)/(2*a);  
            sol2=(b+raiz)/(2*a);
            System.out.println("\nLa solucion 1 es:  "+sol1);
            System.out.println("\nLa solucion 2 es:  "+sol2);
        }
    }
    
}
