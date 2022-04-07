package sec01_controlstatement.Ex01;

public class IfControlStatement {

	public static void main(String[] args) {
		// #1. Type1 : if
		int value3 = 5;
		if (value3 > 3) {
			System.out.println("실행 1");
		}
		
		if (value3 < 5) {
			System.out.println("실행 2");
		}
		
		boolean bool1 = true;
		boolean bool2 = false;
		if (bool1) {
			System.out.println("실행 3");
		}
		
		if (bool2) {
			System.out.println("실행 4");
		}
		System.out.println();
		
		// #2. Type1 : if - else
		int value2 = 5;
		if (value2 > 3) {
			System.out.println("실행 5");		// 실행
		} else {
			System.out.println("실행 6");		// 실행안됨
		}
		
		// @cf. 삼항연산자와 변환 가능
		System.out.println((value2 > 3) ? "실행 5" : "실행 6");
		System.out.println();

		// #3. Type1 : if - else if - else if - else
		int value1 = 85;
		if (value1 >= 90) {
			System.out.println("A 학점");	
		} else if (value1 >= 80) {
			System.out.println("B 학점");	
		} else if (value1 >= 70) {
			System.out.println("C 학점");
		} else {
			System.out.println("F 학점");
		}
		
		if (value1 >= 70) {
			System.out.println("C 학점");
		} else if (value1 >= 80) {
			System.out.println("B 학점");	
		} else if (value1 >= 90) {
			System.out.println("A 학점");	
		} else {
			System.out.println("F 학점");
		}
		
		if (value1 >= 70 && value1 < 80) {
			System.out.println("C 학점");
		} else if (value1 >= 80 && value1 < 90) {
			System.out.println("B 학점");	
		} else if (value1 >= 90) {
			System.out.println("A 학점");	
		} else {
			System.out.println("F 학점");
		}
		
		// 70 <= value1 < 80 => 이런 식의 자바에서는 불가능 => 70 <= value1 && value1 < 80 => 이런 식으로 나눠서 작성해야함
	}
}
