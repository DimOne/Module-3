package com.epam.mentoring.Module_3.part_1;

public class module_2 {

    public static void main(String args[]) {
        int [][] matrix;
        Matrix_actions matrix_actions = new Matrix_actions();

        matrix = matrix_actions.setMatix(matrix_actions.setMatrixSize());
        matrix_actions.printMatrix(matrix);
        matrix_actions.printMatrix( matrix_actions.transpondingMatrix(matrix));
    }
}
