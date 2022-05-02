package sec04_anonymousclass.Ex04;

interface A {
	public abstract void abc();
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass04 {

	public static void main(String[] args) {
		C c = new C();
		
		// #1. 방법 3. 클래스명 X + 참조변수명 O
		A a = new A() {
			@Override
			public void abc() {
				System.out.println("매개변수 전달");
			}
		};
		c.cde(a);	// 매개변수 전달
		
		// #2. 방법 4. 클래스명 X + 참조변수명 X
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("매개변수 전달");
			}
		});
	}
}
