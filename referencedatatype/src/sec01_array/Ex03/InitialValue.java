package sec01_array.Ex03;

import java.util.Arrays;

public class InitialValue {

	public static void main(String[] args) {
		// #1. stack 메모리값 (강제초기화 되지 않음 = 빈 값 허용)
		int value1;
//		System.out.println(value1);		// 값을 할당하지 않아(빈 값) 출력할 수 없어 오류 발생
		
		int[] value2;	// 배열은 무조건 참조자료형. 배열에 들어가는 값의 자료형이 int와 같은 기본자료형처럼 구분하여 이해할 것
						// 모든 변수는 stack 메모리에 저장. 배열과 같은 참조자료형의 경우 값이 heap 메모리에 위치하는 것. 구분하여 이해할 것
//		System.out.println(value2);		// 아직 값을 할당하지 않아(빈 값) 출력할 수 없어 오류 발생
		
		int value3 = 0;
		System.out.println(value3);
		
		int[] value4 = null;	// 참조자료형 값 null : 가리키는 객체값이 없다는 의미
		System.out.println(value4);		// null
		
		// #2. heap 메모리의 초기값 (강제초기화 됨 = 빈 값 허용하지 않음)
		// @기본자료형 배열
		boolean[] array1 = new boolean[3];	// false로 강제초기화
		for (int i = 0; i < 3; i++) {
			System.out.print(array1[i] + " ");
		}	// false false false. array1의 값을 초기화하지 않았지만 강제초기화되어 boolean 기본자료형의 초기값인 false가 이미 배열값으로 할당되어 있어 false 출력
		System.out.println();
		
		int[] array2 = new int[3];	// 0으로 강제초기화
		for (int i = 0; i < 3; i++) {
			System.out.print(array2[i] + " ");
		}	// 0 0 0. int 기본자료형의 초기값인 0을 출력
		System.out.println();
		
		double[] array3 = new double[3];	// 0.0으로 강제초기화
		for (int i = 0; i < 3; i++) {
			System.out.print(array3[i] + " ");
		}	// 0.0 0.0 0.0. double 기본자료형의 초기값인 0.0을 출력
		System.out.println();
		
		// @참조차료형 배열
		String[] array4 = new String[3];	// null로 강제초기화
		for (int i = 0; i < 3; i++) {
			System.out.print(array4[i] + " ");
		}	// null null null. String 참조자료형의 초기값인 null을 출력
		System.out.println();
		System.out.println();
		
		
		// Tip. 배열을 쉽게 출력할 수 있는 방법
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
	}
}
