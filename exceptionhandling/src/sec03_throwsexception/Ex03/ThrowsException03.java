package sec03_throwsexception.Ex03;

class A {
	void abc() {
		bcd();
	}
	
	void bcd()  {
		try {
			Class cls = Class.forName("java.lang.Object");	// 일반예외 : ClassNotFoundException 발생
			Thread.sleep(1000);	// 일반예외 : InterruptedException 발생
		} catch (InterruptedException | ClassNotFoundException e) {
			// 예외처리 구문
		}	
	}
}

class B {
	void abc() {
		try {
			bcd();	// 일반예외 : InterruptedException, ClassNotFoundException 발생
		} catch (InterruptedException | ClassNotFoundException e) {
			// 예외처리 구문
		}
	}
	
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object");	// 예외처리를 전가하였음. bcd()를 호출하는 구문에서 예외처리하여야함
		Thread.sleep(1000);	// 예외처리를 전가하였음. bcd()를 호출하는 구문에서 예외처리하여야함
	}
}

public class ThrowsException03 {

}
