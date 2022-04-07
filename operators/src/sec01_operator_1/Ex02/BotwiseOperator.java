package sec01_operator_1.Ex02;

public class BotwiseOperator {
	public static void main(String[] args) {
		// #0. 자바코드로 진법 변환
		int data = 13;
		System.out.println(Integer.toBinaryString(data));	// 1101. 2진법으로 변환
		System.out.println(Integer.toOctalString(data));	// 15. 8진법으로 변환
		System.out.println(Integer.toHexString(data));	// (0)d. 16진법으로 변환
		
		System.out.println();
		
		System.out.println(Integer.parseInt("1101", 2));	// 13. 1101, 2 : 2진수인 1101을 10진법으로 변환
		System.out.println(Integer.parseInt("15", 8));	// 13. 15, 8 : 8진수인 15을 10진법으로 변환
		System.out.println(Integer.parseInt("0d", 16));	// 13. 0d, 16 : 16진수인 0d을 10진법으로 변환
		System.out.println();
		
		// #1. 다양한 진법 표현
		System.out.println(13);	// 13
		System.out.println(0b1101);	// 13
		System.out.println(015);	// 13
		System.out.println(0x0d);	// 13
		System.out.println();
		
		// #2. 비트연산자
		// @AND 비트연산자
		System.out.println(3 & 10);	// 2
		System.out.println(0b0011 & 0b1010);	// 2
		System.out.println(0x03 & 0x0a);	// 2
		System.out.println();
		
		// @OR 비트연산자
		System.out.println(3 | 10);	// 11
		System.out.println(0b0011 | 0b1010);	// 11
		System.out.println(0x03 | 0x0a);	// 11
		System.out.println();
		
		// @XOR 비트연산자
		System.out.println(3 ^ 10);		// 9
		System.out.println(0b0011 ^ 0b1010);	// 9
		System.out.println(0x03 ^ 0x0a);	// 9
		System.out.println();
		
		// @NOT 비트연산자
		System.out.println(~3);	// -4
		System.out.println(~0b0011);	// -4
		System.out.println(~0x03);	// -4
	}
}
