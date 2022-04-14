package sec02_method.Ex03;

import java.util.Arrays;

public class ArrayArgumentMethod {

	public static void main(String[] args) {
		// 배열을 매개변수로 가지는 메소드 호출
//		int[] a = new int[] {1, 2, 3};
//		printArray(a);
		
		printArray(new int[] {1, 2, 3});
		
//		printArray({1, 2, 3});	// 분리하여 작성 불가능
	}
	
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));
		
//		int[] a;
//		a = {1, 2, 3};	// 분리하여 작성 불가능
		
//		int[] b = {1, 2, 3};	// 가능
	}
}
