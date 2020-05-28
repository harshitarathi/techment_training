/**
 * Author harshita rathi
 *
 */
package com.techment.exercises;

import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int i,temp,j;
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array");
        for(i=1;i<=size;i++){
            arr[i]=sc.nextInt();
        }
        for ( i = 0; i < size; i++)
        {
            for(j = 0; j < size; j++)
            {
                        if(arr[i] > arr[j + 1])
                        {
                            temp = arr[j + 1];
                            arr[j + 1]= arr[i];
                            arr[i] = temp;
                        }
            }
        }
       for(i=1;i<=size;i++){
        System.out.println(arr[i]);  
       }
}
    
}