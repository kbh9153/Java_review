package sec01_accessmodifier.Ex01.pack01;

public class B {
	
	public void print() {	// a, b, c 사용 가능
		// #1. 객체 생성
		A a = new A();
		
		// #2. 멤버 활용
		System.out.println(a.a);	// 가능
		System.out.println(a.b);	// 가능
		System.out.println(a.c);	// 가능
//		System.out.println(a.d);	// 불가능
	}
}
