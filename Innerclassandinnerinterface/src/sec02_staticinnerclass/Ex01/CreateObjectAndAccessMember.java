package sec02_staticinnerclass.Ex01;

class A {
	int a = 3;
	static int b = 4;
	
	void method1() {
		System.out.println("instance method");
	}
	
	static void method2() {
		System.out.println("static method");
	}
	
	// static inner class
	static class B {
		void bcd() {
			// #1. 필드 사용
//			System.out.println(a);
			System.out.println(b);	// static은 static 요소만 포함 가능
			
			// #2. 메소드 호출
//			method1();
			method2();	// static은 static 요소만 포함 가능
		}
	}
}

public class CreateObjectAndAccessMember {

	public static void main(String[] args) {
		// #1. static inner class의 객체 생성ㄴ
		A.B b = new A.B();
		
		// #2. 메소드 호출
		b.bcd();
	}
}
