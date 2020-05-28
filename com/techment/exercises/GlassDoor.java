/**
 * Author harshita rathi
 *
 */
package com.techment.exercises;

import java.util.*;
public class GlassDoor{
    public static void main(final String[] args){
        System.out.println("the two digit number announced by the king");
        final Scanner scin=new Scanner(System.in);
        int num=scin.nextInt();
        scin.close();
        int sum = 0;
       
        while(num!=0){
            int ab;
            ab=num%2;
            sum=sum+ab;
            num=num/10;

        }
        System.out.println(sum);
    }
}