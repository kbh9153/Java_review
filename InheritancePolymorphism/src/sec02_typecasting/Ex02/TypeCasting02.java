package sec02_typecasting.Ex02;

class A {
	int m = 3;
	
	void abc() {
		System.out.println("A 클래스");
	}
}

class B extends A {
	int n = 4;
	
	void bcd() {
		System.out.println("B 클래스");
	}
}

public class TypeCasting02 {

	public static void main(String[] args) {
		// #1. A 타입 / A 생성자
		A aa = new A();
		
		System.out.println(aa.m);
		aa.abc();
		
		// #2. B타입 / B 생성자
		B bb = new B();
		
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		// #3. A 타입 / B 생성자 : 다형적 표현
		A ab = new B();
		
		System.out.println(ab.m);
		ab.abc();
		
		// #4. B 타입으로 다운캐스팅
		B bb2 = (B)ab;
		System.out.println(bb2.m);
		System.out.println(bb2.n);
		bb2.abc();
		bb2.bcd();
	}
	
}
