/**
 * Author harshita rathi
 *
 */
package com.techment.exercises;

import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int i,min=0,j;
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array");
        for(i=1;i<=size;i++){
            arr[i]=sc.nextInt();
        }
        /*---------------------------applynig the sorting algorithm----------------------------------*/
        for(i=1;i<=size;i++){
            min=arr[i];
            for(j=i;j>1;j--){
                while(arr[j-1]<min){
                    min=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=min;
                }

            }
        }
        for(i=1;i<=size;i++){
        System.out.println(arr[i]);  
        }
        
    }
    
}