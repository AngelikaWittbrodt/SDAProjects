package com.sda.matrix;

import java.util.Arrays;

public class MatrixTest {

	public static void main(String[] args) {

		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] n = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
		int[][] a = { { 1, 0, 2 }, { -1, 3, 1 } };
		int[][] b = { { 3, 1 }, { 2, 1 }, { 1, 0 } };
		int o = 2;

		Matrix matrix = new Matrix();
		System.out.println("Input matrix: \n");
		matrix.print2DArray(m);
		System.out.println("Identity matrix: \n");
		matrix.print2DArray(matrix.identityMatrix(m));
		System.out.println("Indexed matrix: \n");
		matrix.print2DArray(matrix.indexedMatrix(m));
		System.out.println("Are matrix equals dimension? " + matrix.isEqualDimension(m, n)+"\n");
		System.out.println("Added two matrix: \n");
		matrix.print2DArray(matrix.addMatrix(m, n));
		System.out.println("Substracted two matrix: \n");
		matrix.print2DArray(matrix.substractMatrix(m, n));
		System.out.println("Multiplicated matrix: \n");
		matrix.print2DArray(matrix.multiplicateMatrix(m, o));
		System.out.println("Transposed matrix: \n");
		matrix.print2DArray(matrix.transpose(n));
		System.out.println("Are matrix symteric? "+matrix.isSymetric(m, matrix.transpose(n))+"\n");
		System.out.println("Multiplicated matrix for matrix: \n");
		matrix.print2DArray(matrix.multiplicateMatrix2matrix(a, b));
		System.out.println("Indicator is "+matrix.indicator(n));

	}

}
