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
public class sueldo_trabajador
{
    public static String[]  LeerNombres(int n)
    {
        String nombres []= new String[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.println("ingresa el nombre del trabajador: ");    
            nombres[i]=br.next();
        }
        return nombres;
    }            
    public static void Imprimir(String[] nombres1, int n)
    {
        System.out.println("========================");
        System.out.println("nombre    comision     sueldo    promediosueldo");
        System.out.println("========================");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(nombres1[i]);
            System.out.println("");
        }
    }
    public static Scanner br= new Scanner(System.in);
    public static void main(String[] args)
    {
        int num;
       
        System.out.print("ingresa el numero de trabajadores: ");
        num=br.nextInt();
        String nombres2 []=new String [num];
        nombres2=LeerNombres(num);
        Imprimir( nombres2, num);
        
    }
}
