package sec01_array.Ex05;

import java.util.Arrays;

public class ReadArrayData {

	public static void main(String[] args) {
		int[] array = new int[]	{3, 4, 5, 6, 7};
		
		// #1. 배열의 길이 구하기
		System.out.println(array.length);	// 5
		System.out.println();
		
		// #2. 출력하기 1:
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println();
		
		// #3. 출력하기 2:
		for (int i = 0; i < 5; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		// #4. 출력하기 3:
//		for (꺼낸 하나의 원소(배열값)를 저장할 수 있는 변수 : 집합객체(ex. 배열, 컬렉션)) {} => for each 구문
		
		for (int k : array) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println();
		
		// #5. 출력하기 4:
		System.out.println(Arrays.toString(array));
	}
}
