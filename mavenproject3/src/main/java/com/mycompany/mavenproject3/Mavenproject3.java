/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author admin
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        int[] a = {2,3,5,6,4,8,9,11};
        int sum = 0;
        for(int x:a)
            if (Ultis.ktNt(x)== true)
                sum += x;
        System.out.println(sum);
    }
}
