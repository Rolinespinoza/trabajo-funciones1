/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabajo_funciones;

import java.util.Scanner;

/**
 *
 * @author alumno.l5
 */
public class Trabajo_funciones 
{
    public static double sumar( int a , double b)
    {
        double sumarr=0;
        sumarr=a+b;
        return sumarr;
        
    }
    public static Scanner br  = new Scanner (System.in);
    
    public static void main(String[] args)
    {
     double sumafinal=0;
     int num1;
     double num2;
        System.out.println("ingresa un numero: ");
        num1=br.nextInt();
        System.out.println("ingresa el segundo  numero: ");
        num2=br.nextDouble();
     sumafinal=sumar(num1, num2);
        System.out.println("la suma es: ");
        System.out.println(sumafinal);
        System.out.println("");
    }
}