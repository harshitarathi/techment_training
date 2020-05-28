/**
 * Author harshita rathi
 *
 */
package com.techment.exercises;

import java.util.*;
public class StuMarks{
public static void main(String[] args){
    System.out.println("enter the number of subjects");
    Scanner sc=new Scanner(System.in);
    int NoOfSub=sc.nextInt();
    int i,sum=0,min=0,j=1,k=1,max=0,count1=0,count2=0;
    int[] sub=new int[20];
    int[] pass=new int[20];
    int[] fail=new int[20];
    for(i=1;i<=NoOfSub;i++){
        System.out.println("enter the marks of subject"+i);
        sub[i]=sc.nextInt();
        sum=sum+sub[i];
    }
    for(i=1;i<=NoOfSub;i++){
         max=min=sub[1];
         if(sub[i]<min)
         min=sub[i];
         if(sub[i]>max)
         max=sub[i];
         
         if(sub[i]>=50)
         {pass[j++]=sub[i];
         count1++;
         }
         else
         {
             fail[k++]=sub[i];
        count2++;
         }
    } System.out.println(count1);
    System.out.println(count2);

    System.out.println("sum"+sum);
    System.out.println("min"+min);
    System.out.println("max"+max);
    for(i=1;i<=j;i++){
        System.out.println(pass[i]);
    
    }
}
}