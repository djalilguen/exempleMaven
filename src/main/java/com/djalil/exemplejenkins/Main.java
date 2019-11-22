/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djalil.exemplejenkins;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(int[] args) {
        int a =args[0];
        int b=args[1];
        int result=0;
        result = produit(a,b);
        System.out.println(result);
    }
    public static int produit(int a,int b){
         int result=0;
        // calculer le produit de a et b
        for (int i=0; i<b; i++){
            result+=a;
        }
    return result;
    }
    
}
