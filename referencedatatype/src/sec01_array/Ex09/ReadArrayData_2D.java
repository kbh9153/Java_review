package sec01_array.Ex09;

public class ReadArrayData_2D {

	public static void main(String[] args) {
		// #1. 2차원 데이터 배열의 길이
		int[][] array1 = new int[2][3];
		System.out.println(array1.length);	// 2. array1은 배열의 행을 가리키고 있음
		System.out.println(array1[0].length);	// 3. array1 배열의 첫번쨰(0) 행이 가리키는 배열의 개수
		System.out.println(array1[1].length);	// 3. array1 배열의 두번쨰(1) 행이 가리키는 배열의 개수
		
		System.out.println();
		
		int[][] array2 = new int[][] {{1, 2}, {3, 4, 5}};
		System.out.println(array2.length);	// 2. array1은 배열의 행을 가리키고 있음
		System.out.println(array2[0].length);	// 2. array1 배열의 첫번쨰(0) 행이 가리키는 배열의 개수
		System.out.println(array2[1].length);	// 3. array1 배열의 두번쨰(1) 행이 가리키는 배열의 개수
		
		System.out.println();
		
		// #2. 2차원 배열의 출력 방법
		System.out.println(array2[0][0]);
		System.out.println(array2[0][1]);
		System.out.println(array2[1][0]);
		System.out.println(array2[1][1]);
		System.out.println(array2[1][2]);
		
		System.out.println();
		
		/*
		for (int i = 0; i < array2.length; i++) {
			for (int k = 0; k < array2[i].length; k++) {
				System.out.print(array2[i][k] + " ");
			}
		}
		System.out.println();
		System.out.println();
		*/
		
		/*
		for (int[] a : array2) {
			for (int b : a) {
				System.out.println(b);
			}
		}
		System.out.println();
		*/
		
		for (int i = 0; i < array2.length; i++) {
			for (int k = 0; k < array2[i].length; k++) {
				if (i == 0 && k == 1) {
					System.out.println(array2[i][k]);
				} else {
					System.out.print(array2[i][k] + " ");
				}
			}
		}	// 1, 2, 3, 4, 5
		
		System.out.println();
		System.out.println();
		
		for (int[] a : array2) {
			for (int b : a) {
				if (b == 2) {
					System.out.println(b);
				} else {
					System.out.print(b + " ");
				}
			}
		}
	}
}
