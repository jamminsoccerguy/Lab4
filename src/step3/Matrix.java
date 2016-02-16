package step3;

/**
 * Created by Mike Plucker
 * Date:  2/16/2016
 * Course: CSCI 1933-12
 */

import java.util.Arrays;

/**
 * Lab 4: Step 3: Matrix
 */
public class Matrix {

    //instance variables
    private int m [][] = {{1,2,3},{4,5,6}};


    //will return a matrix that is the transpose of the matrix, m, passed to it
    public int[][] matrixTranspose(int [][] m){

        int [][] newM = new int[m[0].length][m.length]; //creates new array to transpose in to
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                newM[j][i] = m[i][j]; //copies values into new matrix
            }
        }
        return newM;
    }


    public int[][] getMatrix(){

        return m;
    }


    //test program
    public static void main(String[] args) {

        Matrix matrix = new Matrix(); //create matrix object

        //print out initial matrix
        System.out.println("Initial Matrix = " + Arrays.deepToString(matrix.getMatrix()));


        System.out.println("\n"); //add spacers


        //print out transposed matrix
        System.out.println("Transposed Matrix = " + Arrays.deepToString(matrix.matrixTranspose(matrix.getMatrix())));
    }
}
