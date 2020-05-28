/**
 * Author harshita rathi
 *
 */
package com.techment.exercises;

import java.util.*;

public class BinarySort{
     public static void main(String[] args) {
        int i,element,middle,first,last;
        Scanner sc=new Scanner(System.in);
        int[] lineararr=new int[10];
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array in sorted order");
        for(i=1;i<=size;i++){
            lineararr[i]=sc.nextInt();
        }
        System.out.println("enter the element for search");
        element=sc.nextInt();
        first = 0;
	    last = size-1;
	    middle = (first+last)/2;
	    while (first <= last)
	    {
		    if(lineararr[middle] < element)
		    {
			    first = middle + 1;
    		}
	    	else if(lineararr[middle] == element)
		    {
			   System.out.println("%d found at location " + element+" " + middle);
			    break;
		    }
		    else
		    {
			     last = middle - 1;
	    	}
		    middle = (first + last)/2;
        }
 	    if(first > last)
	    {
		    System.out.println("the element is not present in the list."+ element);
	    }
    }
}