/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author admin
 */
public class Ultis {
    public static boolean ktNt(int n){
        if(n>=2){
            for(int i = 2; i<=Math.sqrt(n);i++)
                if (n % i == 0)
                    return false;
            return true;
        }
        return false;
    }
    
}
