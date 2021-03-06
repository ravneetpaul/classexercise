package com.exercise;

import java.util.Arrays;
import java.util.Collections;

public class exercise {


    public static void main(String [] args){
        Integer[] intArr = new Integer[] {1, 3,4, 2,5,6, 11,18,15,14};

        // displaying in reverse order
        System.out.println("reverse order");
        for(int i=intArr.length-1;i>=0;i--){
            System.out.println(intArr[i]);
        }

        System.out.println("Decending order");

        Arrays.sort(intArr, Collections.reverseOrder());

        for(int i=0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }

        System.out.println("Ascending order");

        Arrays.sort(intArr);

        for(int i=0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }

        System.out.println("only odds");

        for(int i=0;i<intArr.length;i++){
            if(i%2!=0)
                System.out.println(intArr[i]);
        }

        System.out.println("only evens");

        for(int i=0;i<intArr.length;i++){
            if(i%2==0)
                System.out.println(intArr[i]);
        }

        System.out.println("Sum of numbers");

        int sum = 0;
        for(int i=0;i<intArr.length;i++){
            sum += intArr[i];
        }
        System.out.println(sum);
    }

}