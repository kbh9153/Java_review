package sec01_accessmodifier.Ex01.pack02;

import sec01_accessmodifier.Ex01.pack01.A;

public class C {
	
	public void print() {	// a 사용 가능
		// #1. 객체 생성
		A a = new A();	// 다른 패키지의 클래스를 객체화하여 사용하기 위해서는 임포트 필수!
		
		// #2. 멤버 활용
		System.out.println(a.a);	// 가능
//		System.out.println(a.b);	// 불가능
//		System.out.println(a.c);	// 불가능
//		System.out.println(a.d);	// 불가능
	}
}
