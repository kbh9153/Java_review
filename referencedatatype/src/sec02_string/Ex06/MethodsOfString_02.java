package sec02_string.Ex06;

import java.util.Arrays;

public class MethodsOfString_02 {

	public static void main(String[] args) {
		// #5. 문자열 수정
		// @toLowerCase(), toUpperCase()
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());	// java study => 소문자로 변환
		System.out.println(str1.toUpperCase());	// JAVA STUDY => 대문자로 변환
		
		// @replace(,)
		System.out.println(str1.replace("Study", "공부")); // 문자 변경
		
		// @subString(.)
		System.out.println(str1.substring(0, 5));	// 문자열의 0번째 이상 5번째 미만만 출력 (띄어쓰기 포함)
		
		// @split => 문자열 자르기
		String[] strArray = "abc/def-ghi_jkl".split("/|-|_");
		System.out.println(Arrays.toString(strArray));	// abc, def, ghi, jkl
		
		// @trim => 문자열 앞뒤 공백 자르기
		System.out.println("     abc     ".trim());	// abc
		
		System.out.println();
		
		// #6. 문자열의 내용 비교(equals(), equalsIgnoreCase())
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		// @stack 메모리 비교 ( == )
		System.out.println(str2 == str3);	// false
		System.out.println(str2 == str4);	// false
		System.out.println(str3 == str4);	// false
		
		System.out.println();
		
		// @equals(), equalsIgnoreCase() : 내용비교
		System.out.println(str2.equals(str3));	// true	=> 대소문자 구분 O
		System.out.println(str2.equals(str4));	// false
		System.out.println(str3.equalsIgnoreCase(str4));	// true => 대소문자 구분 X
	}
}
