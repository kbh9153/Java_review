package sec02_string.Ex05;

import java.util.Arrays;

public class MethodOfString_01 {

	public static void main(String[] args) {
		// #1. 문자열 길이 (length())
		String str1 = "Hello Java";
		String str2 = "안녕하세요. 반갑습니다!";
		
		System.out.println(str1.length());	// 10
		System.out.println(str2.length());	// 13
		System.out.println();
		
		// #2. 문자열 검색 (charAt(), indexOf(), lastIndexOf())
		// @charAt()
		System.out.println(str1.charAt(1));	// e
		System.out.println(str2.charAt(2));	// 하
		System.out.println();
		
		// @indexOf(), lastIndexOf()
		System.out.println(str1.indexOf('a'));	// 7
		System.out.println(str1.lastIndexOf('a'));	// 9 => 뒤에서 시작하는 것이 아니라 앞에서 시작하지만 가장 뒤에 있는 값을 찾는 것
		System.out.println(str1.indexOf('a', 8));	// 9 => 8번째부터 시작하여 찾음
		System.out.println(str1.lastIndexOf('a', 8));	// 7 => 8번째부터 시작하여 찾음
		System.out.println(str1.indexOf("Java"));	// 6
		System.out.println(str1.lastIndexOf("Java"));	// 6
		System.out.println(str2.indexOf("하세요"));	// 2
		System.out.println(str2.lastIndexOf("하세요"));	// 2
		System.out.println(str1.indexOf("bye"));	// -1 => 찾는 문자열이 없는 경우 -1 출력
		System.out.println(str2.lastIndexOf("반가워요"));	// -1 => 찾는 문자열이 없는 경우 -1 출력
		System.out.println();
		
		// #3. 문자열 변환 및 연결 (String.valueOf(), concat())
		// @String.valueOf(기본자료형) : 기본자료형 -> String
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(19);
		String str5 = String.valueOf(false);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);

		// @concat()
		String str6 = str3.concat(str5);
		System.out.println(str6);
		
		// String.valueOf() + concat() => +
		String str7 = "안녕" + 3;
		
		int a = 7;
		String str8 = "안녕".concat(String.valueOf(a));
		
		System.out.println(str7);
		System.out.println(str8);
		System.out.println();
		
		// #4. 문자열 -> byte[] (getBytes()), 문자열 -> char[] (toCharArray())
		String str9 = "Hello Java";
		String str10 = "안녕하세요";
		
		// @getBytes() 문자열 -> byte[]
		byte[] array1 = str9.getBytes();
		byte[] array2 = str10.getBytes();
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		System.out.println();
		
		// @toCharArray() 문자열 -> char[]
		char[] array3 = str9.toCharArray();
		char[] array4 = str10.toCharArray();
		
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
	}
}
