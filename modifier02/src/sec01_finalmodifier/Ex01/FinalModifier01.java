package sec01_finalmodifier.Ex01;

class A1 {
	int a = 3;
	final int b = 5;
	
	A1() {
		
	}
}

class A2 {
	int a;
	final int b;
	
	A2() {
		a = 3;
		b = 5;
	}
}

class A3 {
	int a = 3;
	final int b = 5;
	
	A3() {
		a = 5;
//		b = 7;	// final 필드는 한번 정해진 값을 바꿀 수 없음(정확히는 최초로 선언한 값 이후 추가적인 값의 대입 자체가 불가능 -> 기존과 동일한 값의 대입을 시도해도 오류 발생)
	}
}

class B {
	void bcd() {
		int a = 3;
		final int b = 5;
		a = 7;
//		b = 9;	// final 필드는 한번 정해진 값을 바꿀 수 없음(정확히는 최초로 선언한 값 이후 추가적인 값의 대입 자체가 불가능 -> 기존과 동일한 값의 대입을 시도해도 오류 발생)
	}
}

public class FinalModifier01 {

	public static void main(String[] args) {
		// #1. 객체 생성
		A1 a1 = new A1();
		A2 a2 = new A2();
		
		// #2. 필드값 변경
		a1.a = 7;
//		a1.b = 9;	// final 필드는 한번 정해진 값을 바꿀 수 없음(정확히는 최초로 선언한 값 이후 추가적인 값의 대입 자체가 불가능 -> 기존과 동일한 값의 대입을 시도해도 오류 발생)
		
		a2.a = 7;
//		a2.b = 9;	// final 필드는 한번 정해진 값을 바꿀 수 없음(정확히는 최초로 선언한 값 이후 추가적인 값의 대입 자체가 불가능 -> 기존과 동일한 값의 대입을 시도해도 오류 발생)
	}
}
