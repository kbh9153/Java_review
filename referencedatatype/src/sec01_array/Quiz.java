package sec01_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		// #Q4
		int[] a = new int[] {1, 2, 3, 4, 5};
		
		for (int k : a) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// #Q5
		int[][] a1 = new int[2][];
		a1[0] = new int[] {1, 3, 5};
		a1[1] = new int[] {7, 9};
		
		// #Q6
		for (int i = 0; i < a1.length; i++)	{
			for (int k = 0; k < a1[i].length; k++) {
				if (i == 0 && k == 1 ) {
					System.out.println(a1[i][k]);
				} else {
					System.out.print(a1[i][k] + " ");
				}
			}
		}
	}
}
