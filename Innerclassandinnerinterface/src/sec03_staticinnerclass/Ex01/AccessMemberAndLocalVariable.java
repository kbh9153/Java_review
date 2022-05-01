package sec03_staticinnerclass.Ex01;

class A {
	int a = 3;	// 필드
	void abc() {
		int b = 5;	// 지역변수
//		b = 7;	// 지역변수는 사용과 동시에 final 키워드를 컴파일러가 자동으로 추가. 때문에 값의 추가적인 대입이 불가능
		
		// 지역이너클래스
		class B {
			void bcd() {
				System.out.println(a);	// 필드
				System.out.println(b);	// 지역변수
				
				a = 5;
//				b = 7;	// 지역변수는 사용과 동시에 final 키워드를 컴파일러가 자동으로 추가. 때문에 값의 추가적인 대입이 불가능
			}
		}
		
		B bb = new B();
		bb.bcd();
	}
}

public class AccessMemberAndLocalVariable {

	public static void main(String[] args) {
		// #1. 객체 생성 및 메소드 호출
		A a = new A();
		a.abc();
	}
}
