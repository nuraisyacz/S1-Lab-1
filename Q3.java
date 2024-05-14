/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1;

/**
 *
 * @author nuraisyachezulkifli
 */
public class Q3 {
    public static void main(String[] args){
        for (int i = 0; i<9; i++){
            if (i == 0 || i == 8){
                for (int j = 0; j<9; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }    
            else{
                System.out.println("*       *");
            }       
        }        
    }
}
