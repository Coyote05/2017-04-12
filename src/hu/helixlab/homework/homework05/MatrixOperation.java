package hu.helixlab.homework.homework05;

import java.util.Random;

public class MatrixOperation implements IMatrixOperation{

    public void printMatrix(int[][] array){

        Random random = new Random();

        for(int i = 0; i < array.length; ++i){
            for(int j = 0; j < array.length; ++j){

                array[i][j] = random.nextInt(2);
                System.out.print("\t" + array[i][j]);
            }
            System.out.println();
        }
    }
    public int[][] initMatrixWithRandomNumbers(int m, int n, int randomMin, int randomMax){

        int[][] array2 = new int[m][n];
        for(int i = 0; i < array2.length; ++i){
            for(int j = 0; j < array2.length; ++j){

                int randomNumber = randomMin + (int)(Math.random() * ((randomMax - randomMin) + 1));

                array2[i][j] = randomNumber;

                System.out.print("\t" + array2[i][j]);
            }
            System.out.println();
        }
        return array2;
    }
}
