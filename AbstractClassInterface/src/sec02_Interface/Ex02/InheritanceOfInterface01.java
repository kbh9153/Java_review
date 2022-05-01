package sec02_Interface.Ex02;

interface A {}
interface B {}

// #1. 단일 인터페이스 상속
class C implements A {}

// #2. 다중 인터페이스 상속
class D implements A, B {}

// #3. 클래스와 인터페이스를 동시에 상속
class E extends D implements A, B {}	// 무조건 extends(클래스) → implements(인터페이스) 순으로 상속. 순서를 변경할 수 없음
										// 인터페이스만 다중 상속 가능. 클래스는 다중 상속 불가능

public class InheritanceOfInterface01 {

	public static void main(String[] args) {
		
	}
}
