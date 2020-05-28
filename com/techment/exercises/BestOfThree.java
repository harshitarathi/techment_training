/**
 * Author harshita rathi
 *
 */
package com.techment.exercises;

import java.util.*;
public class BestOfThree{
    public static void main(String[] args) {
        Scanner scin=new Scanner(System.in);
        System.out.println("enter the weights of horses");
        int first=scin.nextInt();
        int second=scin.nextInt();
        int third=scin.nextInt();
        scin.close();
        if(first>second && second>third)
        System.out.println("first horse is best");
        else if(second>third && third>first)
        System.out.println("second horse is best");
        else if(third>first && first>second)
        System.out.println("third horse is best");
        else
        System.out.println("weights are not distinct");

        
    }
}