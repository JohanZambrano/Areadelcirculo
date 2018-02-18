/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularhoras;

/**
 *
 * @author Johan Zambrano
 */
public class CalcularHoras {

    /**
     *Calcula semanas,dias y horas restantes respecto al total de horas ingresadas
     * @version  1.8.0_161, 18/2/18
     * @autor Johan Zambrano
     */
    public static void main(String[] args) {
        int horas=1000; //horas iniciales
        int total_semanas=0,total_horas=0,total_dias=0; //variables para las horas equivalentes
        if(horas>=0){//verifica si las horas ingresadas son mas de 0 para que sean validas
        total_dias=horas/24; //divide la cantidad de horas entre 24 para sacar la cantidad total de dias
        if(total_dias>=1){ //verifica si la cantidad de dias es mayor o igual, lo que indica que la cantidad de las horas es mayor o igual a un dia
            total_semanas=total_dias/7; //divida la cantidad de dias entre 7 para verificar si hay o una o mas semanas
            if(total_semanas>=1){ //verfica si las semanas son mayores o iguales a 0
                total_dias=total_dias % 7; //saca el mood de los dias para saber cuantos dias sobran si no se cumple la semana
                total_horas=horas-(total_dias*24)-(total_semanas*168); //casa las horas restantes
            }else{ 
                total_semanas=0; //semanas las iguala a 0, ya que las horas ingresadas no pasan las semanas
                total_horas=horas-(total_dias*24); //las horas ingresadas menos las horas de los dias correspondientes, para calcular las horas sobrantes
            }
        }else{//las horas ingresadas no son mayores a las horas de un dias
            total_semanas=0;
            total_dias=0;
            total_horas=horas;
        }
        System.out.println("DIAS TOTALES: "+total_dias);
        System.out.println("SEMANAS TOTALES: "+total_semanas);
        System.out.println("HORAS TOTALES: "+total_horas);
        }else{ //las horas ingresadas no son validas
            System.out.println("Horas no validas");
        }
    }//void
}//public class