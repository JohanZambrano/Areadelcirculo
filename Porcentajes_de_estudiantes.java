/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcentajes_de_estudiantes;

/**
 *
 * @author Johan Zambrano
 */
public class Porcentajes_de_estudiantes {

    /**
     *Calcula semanas,dias y horas restantes respecto al total de horas ingresadas
     * @version  1.8.0_161, 18/2/18
     * @autor Johan Zambrano
    */
    public static void main(String[] args) {
        double estudiantes=240;
        double menores=120;
        double por;
        por=menores/estudiantes;
        System.out.println("Cantidad de estudiantes = "+estudiantes);
        System.out.println("Cantidad de estudiantes menores de edad = "+menores);
        System.out.println("Porcentaje = "+por+" %");
    }   
}