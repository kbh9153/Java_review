package sec02_string.Ex02;

import java.util.Arrays;

public class ModificationOfStringData {
	
	public static void main(String[] args) {
		// #1. 문자열 수정 (객체내의 값 변경 불가 => 변경시 새로운 객체 생성)
		String str1 = new String("안녕");
		String str2 = str1;		// 주소값을 복사하여 str2, str1 서로 같은 주소값을 가지고 있음
		
		str1 = "안녕하세요";
		
		System.out.println(str1);	// 안녕하세요
		System.out.println(str2);	// 안녕
		
		// @배열 참조자료형
		int[] array1 = new int[] {3, 4, 5};
		int[] array2 = array1;
		
//		array2[0] = 1;
//		array2[1] = 2;
//		array2[2] = 3;
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = i + 6;
		}
		
		System.out.println(Arrays.toString(array1));	// [6, 7, 8]
		System.out.println(Arrays.toString(array2));	// [6, 7, 8]
		
	}
}
