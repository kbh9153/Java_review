package sec05_superkeywordsupermethod.Ex03;

class A {
	A() {
		System.out.println("A 생성자");
	}
}

class B extends A {
	B() {		// 상속받은 자식 클래스의 기본 생성자 첫 줄에는 super() 또는 this()가 있어야함. 생략 시 컴파일러가 super()를 자동 생성
		super();	// 부모클래스의 생성자 호출
		System.out.println("B 생성자");
	}
}

class C {
	C(int a) {
		System.out.println("C 생성자");
	}
}

class D extends C {
//	D() {			// @1
//		super();	// @2
//	}				// @3 => @1 ~ @3 컴파일러가 자동으로 추가해주는 내용
	
	D() {
		super(3);
	}
}
public class SuperMethod01 {

	public static void main(String[] args) {
		// #1. A 객체 생성
		A aa = new A();		// A 생성자
		
		System.out.println();
		
		// #2. B 객체 생성
		B bb = new B();		// A 생성자 -> B 생성자
	}
}
