package InheritancePolymorphism.Ex02;

// 상속관계 만들기
class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Polymorphism {

	public static void main(String[] args) {
		// #1. A 타입의 다형적 표현
		A a1 = new A();	// A는 A이다. 가능
		A a2 = new B();	// B는 A이다. 가능
		A a3 = new C();	// C는 A이다. 가능
		A a4 = new D();	// D는 A이다. 가능
		
		// #2. B 타입의 다형적 표현
//		B b1 = new A();	// A는 B이다. 불가능 (A는 B의 부모이기 때문에 상속이 불가능)
		B b2 = new B();	// B는 B이다.	가능
		B b3 = new C();	// C는 B이다. 가능
		B b4 = new D();	// D는 B이다. 가능
		
		// #3. C 타입의 다형적 표현
//		C c1 = new A();	// A는 C이다. 불가능 (A는 C의 부모이기 때문에 상속이 불가능)
//		C c2 = new B();	// B는 C이다. 불가능 (B는 C의 부모이기 때문에 상속이 불가능)
		C c3 = new C();	// C는 C이다. 가능
//		C c4 = new D();	// D는 C이다. 불가능 (D의 부모는 B와 A이기 때문에 상속이 불가능)
		
		// #4. D 타입의 다형적 표현
//		D d1 = new A();	// A는 D이다. 불가능 (A는 D의 부모이기 때문에 상속이 불가능)
//		D d2 = new B();	// B는 D이다. 불가능 (B는 D의 부모이기 때문에 상속이 불가능)
//		D d3 = new C(); // C는 D이다. 불가능 (C의 부모는 B와 A이기 때문에 상속이 불가능)
		D d4 = new D();	// D는 D이다. 가능
	}
}
