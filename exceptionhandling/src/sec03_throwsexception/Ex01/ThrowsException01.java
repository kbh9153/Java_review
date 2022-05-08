package sec03_throwsexception.Ex01;

// #1. 하위클래스에서 직접 예외를 처리하는 경우
class A {
	void abc() {
		bcd();
	}
	
	void bcd()  {
		try {
			Thread.sleep(1000);	// 일반예외 : InterruptedException 발생
		} catch (InterruptedException e) {
			// 예외처리 구문
		}	
	}
}

// #2. 예외를 호출 메서드로 전가하는 경우
class B {
	void abc() {
		try {
			bcd();	// 일반예외 : InterruptedException 발생
		} catch (InterruptedException e) {
			// 예외처리 구문
		}
	}
	
	void bcd() throws InterruptedException {
		Thread.sleep(1000);	// 예외처리를 전가하였음. bcd()를 호출하는 구문에서 예외처리하여야함
	}
}

public class ThrowsException01 {

}
