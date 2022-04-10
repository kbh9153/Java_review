package sec01_array.Ex10;

public class ArgumentOfMainMethod {
	
	public static void main(String[] args) {
		// #1. args 배열의 길이 구하기
		System.out.println(args.length);
		System.out.println();
		
		// #2. 매개변수 출력 1
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println();
		System.out.println(args[1] + 1);	// 4가 아니라 31이 출력. args 배열의 3은 문자열이기 때문
		System.out.println(Integer.parseInt(args[1]) + 1);	// 4 출력. args 배열의 3 문자열 값을 정수로 변환하여 연산
		System.out.println();
		
		
		// #2. 매개변수 출력 2
		for (String a : args) {
			System.out.println(a);
		}
	}
}
