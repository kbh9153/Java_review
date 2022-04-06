package sec01_datatype.Ex02;

public class NamingVariableAndConstant {
	public static void main(String[] args) {
		// #1. 변수의 이름
		boolean aBcD;	// 가능은 하지만 권고사항 위배
		byte 가나다;
		short _abcd;
		char $ab_cd;
		// int 3abcd;	// 불가능. 숫자는 제일 앞에 올 수 없음
		long abcd3;
		// float int;	// 자바에서 사용하는 키워드는 변수명으로 사용 불가능
		double main;	// 가능. 메서드 이름과 변수이름은 동일해도 무관
		// int my work	// 불가능. 띄어쓰기(스페이스 특수키 포함) 사용 불가능
		String myClassNmame;
		int ABC;	// 가능은 하지만 권고사항 위배
		
		// #2. 상수의 이름
		final double PI;
		final int MY_DATA;
		final float myData;	// 가능은 하지만 권고사항 위배
		
		// abc();	// 메서드 호출
		// System.out.println(abc);	// 변수를 사용하는 방법
	}
}
