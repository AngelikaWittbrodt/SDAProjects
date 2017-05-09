package com.sda.matrix;

import java.util.Arrays;

public class Matrix {

	public void print2DArray(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println();
	}

	public int[][] identityMatrix(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 1;
			}
		}
		return m;
	}

	// Funkcja przypisuje macierzy liczby od 1

	public int[][] indexedMatrix(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = j + 1 + 3 * i;
			}
		}
		return m;
	}

	public boolean isEqualDimension(int[][] m, int[][] n) {

		boolean rows = m.length == n.length;
		boolean isEquals = false;
		if (rows == true) {
			isEquals = m[m.length - 1].length == n[n.length - 1].length;
		} else {
			isEquals = false;
		}
		return isEquals;
	}

	public int[][] addMatrix(int[][] m, int[][] n) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[i][j] = m[i][j] + n[i][j];
			}
		}
		return n;
	}

	public int[][] substractMatrix(int[][] m, int[][] n) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[i][j] = m[i][j] - n[i][j];
			}
		}
		return n;
	}

	public int[][] multiplicateMatrix(int[][] m, int o) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = m[i][j] * o;
			}
		}
		return m;
	}

	public int[][] transpose(int[][] n) {

		int[][] k = new int[3][3];
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				k[i][j] = n[j][i];
			}
		}
		return k;
	}

	public boolean isSymetric(int[][] m, int[][] n) {

		boolean isSym = true;
		if (Arrays.deepEquals(m, n)) {
			isSym = true;
		} else {
			isSym = false;
		}
		return isSym;
	}

	public int[][] multiplicateMatrix2matrix(int[][] a, int[][] b) throws IllegalArgumentException {
		if (a.length != b[0].length) {
			throw new IllegalArgumentException("Tabele mają nieodpowiednie rozmiary!");
		}

		int[][] c = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}

	// Oliczającą wyznacznik macierzy 3x3 (ze sprawdzeniem wymiarów przekazanej
	// macierzy).

	public int indicator(int[][] m) throws IllegalArgumentException {

		if (m.length != m[0].length) {
			throw new IllegalArgumentException("Nie można wyznaczyć wyznacznika dla macierzy niekwadratowej!");
		}

		int result = 0;

		if (m.length == 1) {
			result = m[0][0];
		} else {

			for (int i = 0; i < m[0].length; i++) {
				int[][] temp = new int[m.length - 1][m[0].length - 1];

				for (int j = 1, jm = 0; j < m[0].length; j++) {

					for (int k = 0, km = 0; k < m[0].length; k++) {
						if (j != 0 && k != i) {

							temp[jm][km] = m[j][k];
							km++;
						}
					}

					jm++;

				}

				result += m[0][i] * Math.pow(-1, (1 + (i + 1))) * this.indicator(temp);

			}
		}
		return result;
	}

}
