package sec02_staticmodifier.Ex03;

class A {
	static int a;
	int b;
	
	void abc() {	// 인스턴스 메소드
		System.out.println("instance method");
	}
	
	static void bcd() {		// static(정적) 메소드
		System.out.println("static method");
//		System.out.println("static method" + a);	// static 메소드 안에는 static 멤버와 같이 객체화 하지 않고도 바로 사용할 수 요소들만 사용 가능
//		System.out.println("static method" + b);	// b는 인스턴스 필드이기 때문에 객체화를 하여야 사용 가능하여 static 메소드 안에서는 사용 불가
	}	
}

public class StaticMethod {

	public static void main(String[] args) {
		// #1. 인스턴스 메소드 활용방법(객체 생성 후 사용 가능)
		A a1 = new A();
		a1.abc();	// instance method
		
		// #2. 정적 메소드 활용 방법
		// @방법 1. 클래스 이름으로 바로 접근하여 사용
		A.bcd();	// static method
		
		// @방법 2. 객체 생성 후에도 사용 가능 => 가능한 지양
		A a2 = new A();
		a2.bcd();
	}
}
