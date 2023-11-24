package com.mycompany.number_to_binary;

import java.util.Scanner;

/**
 *
 * @author TAOLLIN
 */
public class Number_to_binary {

    public static void main(String[] args) {
        
        System.out.println("Cualquier numero a binario (Enteros positivos y negativos)."); 
        
        Scanner tao = new Scanner(System.in); //
        
        System.out.print("Ingrese el numero a checar:");
        float n = tao.nextFloat();
        
        if(n>0){
        
            double np = n;
        
            String binario_positivo = Integer.toBinaryString((int) np);

            System.out.println(n + " en binario: " + binario_positivo);
             
        }else{
            if (n<0){
                
                double np = n;
                
                String binario_negativo = Integer.toBinaryString((int) np);
                
                System.out.println(n + " en binario (32 bits): " + binario_negativo);
            }else{
                if(n==0){
                    double np = n;
        
            String binario_positivo = Integer.toBinaryString((int) np);

            System.out.println(n + " en binario: " + binario_positivo);
                }
            }
        }
    }
    
}
