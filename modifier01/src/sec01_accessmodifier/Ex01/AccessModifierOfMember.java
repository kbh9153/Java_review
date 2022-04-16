package sec01_accessmodifier.Ex01;

import sec01_accessmodifier.Ex01.pack01.A;
import sec01_accessmodifier.Ex01.pack01.B;
import sec01_accessmodifier.Ex01.pack02.C;
import sec01_accessmodifier.Ex01.pack02.D;

public class AccessModifierOfMember {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();	// class A의 a, b, c, d 필드 사용 가능
		System.out.println();
		b.print();	// class A의 a, b, c 필드 사용 가능
		System.out.println();
		c.print();	// class A의 a 필드 사용 가능
		System.out.println();
		d.print();	// class A의 a, b 필드 사용 가능
		
	}
}
