/**
 * Author harshita rathi
 *
 */
package com.techment.exercises;

import java.util.*;
public class EvenOdd{
    public static void main(String[] args){
        System.out.println("enter the valid car number");
        Scanner scin=new Scanner(System.in);
        int num=scin.nextInt();
        scin.close();
        if(num<1||num>31)
        System.out.println("invalid number");
        else if(num%2==0)
        System.out.println("even number of cars are aliowed");
        else
        System.out.println("odd number cars are allowed" );
    }
}