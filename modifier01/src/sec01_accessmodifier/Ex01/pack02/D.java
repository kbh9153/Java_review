package sec01_accessmodifier.Ex01.pack02;

import sec01_accessmodifier.Ex01.pack01.A;

public class D extends A {	// D 클래스는 A 클래스의 자식임 => 상속받음
	
	public void print() {	// a, b 사용 가능
		// #1. 객체 생성
//		A a = new A();	// 객체 생성 불필요 => D 클래스가 A 클래스를 상속받아 D 클래스는 A 클래스의 내부 구성요소들을 이미 가지고 있음 
		
		// #2. 멤버 활용
		System.out.println(a);	// 가능
		System.out.println(b);	// 가능
//		System.out.println(c);	// 불가
//		System.out.println(d);	// 불가
	}
}
