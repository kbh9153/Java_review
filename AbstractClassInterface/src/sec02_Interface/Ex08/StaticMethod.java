package sec02_Interface.Ex08;

interface A {
	static void abc( ) {	// 접근 지정자는 인터페이스 문법에 따라 public
		System.out.println("A 인터페이스의 정적 메소드 abc()");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// #1. 정적 메소드 호출
		A.abc();	// A 인터페이스의 정적 메소드 abc()
	}
}
