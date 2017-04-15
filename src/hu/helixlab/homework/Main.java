package hu.helixlab.homework;

import hu.helixlab.homework.homework05.MatrixOperation;
import hu.helixlab.homework.homework05.Sort;

public class Main {

    public static void main(String[] args) {
/*
        Sort sort = new Sort();

        System.out.println(sort.bubbleSort());
*/
        int[][] array = new int[4][4];

        MatrixOperation matrixOperation = new MatrixOperation();

        System.out.println();
        System.out.println("Második feladat");
        matrixOperation.printMatrix(array);

        System.out.println();
        System.out.println("Harmadik feladat");

        int[][] array2 = new int[5][5];
        matrixOperation.initMatrixWithRandomNumbers(array2, 2,5);

    }
}
