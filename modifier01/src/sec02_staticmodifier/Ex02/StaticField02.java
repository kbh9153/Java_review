package sec02_staticmodifier.Ex02;

// static 필드의 공유 특징

class A {
	int m = 3;	// 인스턴스 필드
	static int n = 5;	// 정적 필드
}

public class StaticField02 {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		// 인스턴스 필드
		a1.m = 5;
		a2.m = 6;
		
		System.out.println(a1.m);	// 5
		System.out.println(a2.m);	// 6
		
		// 정적필드
		a1.n = 7;
		a2.n = 8;
		
		System.out.println(a1.n);	// 8
		System.out.println(a2.n);	// 8
		
		A.n = 11;
		
		System.out.println(a1.n);	// 11
		System.out.println(a2.n);	// 11
	}
}
