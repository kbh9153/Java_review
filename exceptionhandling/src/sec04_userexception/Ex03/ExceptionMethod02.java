package sec04_userexception.Ex03;

class A {
	void abc() throws NumberFormatException {	// 클래스 멤버 메소드들 전부 예외처리하지 않고 main 메소드에게 예외전가함
		bcd();
	}
	
	void bcd() throws NumberFormatException {
		cde();
	}
	
	void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");
	}
}

public class ExceptionMethod02 {

	public static void main(String[] args) {
		// #1. 객체 생성
		A a = new A();
		
		// #2. 메소드 호출	및 예외처리
		try {
			a.abc();
		} catch(NumberFormatException e) {
			e.printStackTrace();	// 예외발생 과정을 출력
		}
	}
}
