package sec01_finalmodifier.Ex02;

class A {
	void abc() {}
	final void bcd() {}
}

class B extends A {
	@Override
	void abc() {}
	
//	@Override
//	void bcd() {}	// final 메소드는 오버라이딩이 불가능
}

final class C {}

//class D extends C {}	// final 클래스는 상속 자체가 불가능

public class FinalModifier02 {

}
