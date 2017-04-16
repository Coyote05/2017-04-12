package hu.helixlab.homework;

import hu.helixlab.homework.homework05.MatrixOperation;
import hu.helixlab.homework.homework05.Sort;

public class Main {

    public static void main(String[] args) {

        Sort sort = new Sort();

        System.out.println();
        System.out.println("Első és negyedik feladat");

        int[] bubble = {8, 7, 3, 2, 10, 5, 6, 4, 1, 9};
        sort.bubbleSort(bubble);

        MatrixOperation matrixOperation = new MatrixOperation();

        System.out.println();
        System.out.println("Második feladat");

        matrixOperation.printMatrix();

        System.out.println();
        System.out.println("Harmadik feladat");

        matrixOperation.initMatrixWithRandomNumbers(3,3, 2,5);

    }
}
