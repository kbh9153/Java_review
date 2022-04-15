package sec03_constructor.Ex01;

// 컴파일러가 자동 추가해주는 생성자 (기본생성자)

class A {
	int m;
	
	void work() {
		System.out.println(m);	// 0
	}
	
	// 컴파일러가 자동으로 추가해주는 기본 생성자
	A () {
		// { } 중괄호 사이에는 객체 생성 후 해야할 추가 일들을 작성
	}; 
}

class B {
	int m;
	
	void work() {
		System.out.println(m);	// 0
	}
	
	B () {	// 기본 생성자
		
	}
}

class C {
	int m;
	
	void work() {
		System.out.println(m);	// 생성자로 넘어온 값
	}
	
	C (int a) {	// 생성자의 기본 기능 : 객체 생성 + 필드 초기화
		m = a;
	}
}


public class DefaultConstructor {

	public static void main(String[] args) {
		// #1. 클래스의 객체 생성
		A a = new A();
		B b = new B();
//		C c = new C();	// C 클래스의 생성자는 매개변수를 가지고 있어 빈 생성자는 불가능
		C c = new C(7);
		
		// #2. 메소드 호출
		a.work();	// 0
		b.work();	// 0
		c.work();	// 7
	}
}
