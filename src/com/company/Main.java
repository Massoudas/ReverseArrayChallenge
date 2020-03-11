package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    public static int[] getArray(int count){
        int[] array = new int[count];
        System.out.println("Enter the array's elements: ");
        for (int i=0; i<array.length; i++){
            array[i]=scanner.nextInt();
            scanner.nextLine();
        }

        return array;
    }
    public static void reverseArray(int[] array){
        int[] reversedArray=new int[array.length];
        int j=0;

        for(int i=array.length-1; i>=0;i--){
            reversedArray[j]=array[i];
            j++;

        }
        System.out.println("the original array is: "+Arrays.toString(array));
        System.out.println("the reversed array is: "+Arrays.toString(reversedArray));
    }

    public static void main(String[] args) {
        reverseArray(getArray(5));
	// write your code here
    }
}
