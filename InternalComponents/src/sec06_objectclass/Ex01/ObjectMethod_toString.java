package sec06_objectclass.Ex01;

class A {	// extends Object (컴파일러에 의해서 자동 추가) -> 모든 클래스는 Object의 자식 클래스
	int a = 3;
	int b = 4;
}

class B {
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {	// Object 클래스의 toString을 오버라이드하여 재정의함
		return "필드값(a, b) = " + a + " " + b;
	}
}

public class ObjectMethod_toString {

	public static void main(String[] args) {
		// #1. 객체 생성
		A a = new A();
		B b = new B();
		
		// #2. 메소드 호출
		System.out.printf("%x\n", a.hashCode());	// hashcode를 16진수로 표현 => 15db9742
		System.out.println(a);	// a 객체정보 출력 => sec06_objectclass.Ex01.A@15db9742
								// 객체정보 출력시 컴파일러가 .toString()을 자동으로 추가 => Object에 toString 메소드가 있음
		System.out.println(b);	// 필드값(a, b) = 3 4
	}
}
