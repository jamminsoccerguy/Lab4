package step0;

/**
 * Created by Mike Plucker
 * Date: 2/16/2016
 * Course: CSCI 1933-12
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Lab 4: Step 0: Warm Up
 */
public class WarmUp {

    public static void main(String[] args) {

        //create objects
        Scanner scan = new Scanner(System.in);

        //field variables
        int [] array;
        int n;
        int sum = 0;


        //find out how large array is
        System.out.print("How many Integers are in the Array: ");
        n = scan.nextInt();

        array = new int [n]; //creates new array with size "n"


        //read in integers from user
        for(int i = 0; i < array.length; i++){ //iterates over array

            System.out.print("Enter an Integer: ");
            array[i] = scan.nextInt();
        }


        System.out.println(""); //adds spacing


        //print out array using for loop
        for(int i = 0; i < array.length; i++){

            System.out.print(array[i]);
        }


        System.out.println("\n"); //adds spacing


        //print out array using Arrays.toString(name of array)
        System.out.println("Array = " + Arrays.toString(array));


        System.out.println(); //adds spacing


        //print out array using foreach loop
        for(int a : array){
            System.out.println(a);
        }


        //add elements of array to sum
        for(int i = 0; i < array.length; i++){

            sum += array[i];
        }

        //print out sum
        System.out.println("\nSum of Integers in Array = " + sum);
    }
}
