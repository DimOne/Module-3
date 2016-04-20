package com.epam.mentoring.part_1;

import java.util.Scanner;

public class Matrix_actions {

    public int [][] matrix;
    public int rows;
    public int columns;

    public int [][] setMatix(int [][] matrix) {

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Enter  element [" + i + "][" + j + "]");
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;
    }

    public int [][] setMatrixSize() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rows size: ");
        rows = in.nextInt();
        System.out.println("Enter columns size: ");
        columns = in.nextInt();
        return matrix = new int[rows][columns];
    }

    public void printMatrix(int [][] matrix) {
        System.out.print("Entered matrix is: \n");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int [][] transpondingMatrix(int [][] matrix) {
        int [][] transponded_matrix = new int[columns][rows];
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < columns; j ++) {
                transponded_matrix[i][j] = matrix[j][i];
            }
        }
        return transponded_matrix;
    }

}
