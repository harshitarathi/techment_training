/**
 * Author harshita rathi
 *
 */
package com.techment.exercises;

import java.util.*;
public class LinearSort{
    public static void main(String[] args){
        int i,element,flag=0;
        Scanner sc=new Scanner(System.in);
        int[] lineararr=new int[10];
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array");
        for(i=1;i<=size;i++){
            lineararr[i]=sc.nextInt();
        }
        System.out.println("enter the element for search");
        element=sc.nextInt();
        for(i=1;i<=size;i++){
            if(lineararr[i]==element)
            flag++;
          
        }
        if(flag!=0)
        System.out.println("the element found");
        else
        System.out.println("not found");
    }
}