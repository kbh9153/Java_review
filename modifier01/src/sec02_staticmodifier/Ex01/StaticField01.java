package sec02_staticmodifier.Ex01;

class A {
	int m = 3;	// 인스턴스(객체) 필드
	static int n = 5;	// 정적(static) 필드
}

public class StaticField01 {

	public static void main(String[] args) {
		// #1. 인스턴스 필드 활용방법 (항상 객체 생성 후 사용 가능)
		A a1 = new A();
		System.out.println(a1.m);	// 3
		
		// #2. 정적(static)필드 활용 방법
		// @방법 #1 : 객체 생성없이 클래스 이름으로 바로 활용)
		System.out.println(A.n);	// 5
		
		// @방법 #2 : 객체 생성 후 활용 (인스턴스 방법과 동일) => 가능한 지양
		A a2 = new A();
		System.out.println(a2.n);	// 5
		
	}
}
