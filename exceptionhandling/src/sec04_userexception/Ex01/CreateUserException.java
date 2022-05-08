package sec04_userexception.Ex01;

// #1. 사용자 일반예외 (checked exception)
class MyException extends Exception {
	public MyException() {
		// super()가 생략되어 있음. 컴파일러가 자동으로 추가
	}
	
	public MyException(String message) {
		super(message);
	}
}

// #2. 사용자 실행예외 (Unchecked exception = runtimeexception)
class MyRTException extends RuntimeException {
	public MyRTException() {
		super();
	}
	
	public MyRTException(String message) {
		super(message);
	}
	
}

class A {
	// #3. 사용자 정의 예외 객체 생성
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외 메세지 : MyException");
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외 메세지 : MyRTException");

	
	// #4. 예외 던지기 (throw) : 던진 시점에서 예외 발생
	// @방법 #1. 예외를 직접처리
	void abc_1(int num) {
		try {
			if (num > 70) {
				System.out.println("정상작동");
			} else {
				throw me1;	// 예외를 던진 이 시점에 예외 발생
			}
		} catch (MyException e) {
			System.out.println("예외처리 1");
		}
	}
	
	void abc_2(int num) {
		if (num > 70) {
			System.out.println("정상작동");
		} else {
			try {
				throw me1;	// 예외를 던진 이 시점에 예외 발생
			} catch (MyException e) {
				System.out.println("예외처리 1");
			}
		}
	}
	
	void bcd_1() {
		abc_1(65);
	}
	
	// @방법 #2. 예외의 전가
	void abc_3(int num) throws MyException {
		if (num > 70) {
			System.out.println("정상작동");
		} else {
			throw me1;
		}
	}
	
	void bcd_2() {
		try {
			abc_3(65);
		} catch (MyException e) {
			System.out.println("예외처리 2");
		}
	}
}

public class CreateUserException {
	
	public static void main(String[] args) {
		A a = new A();
		a.bcd_1();	// 예외처리 1
		a.bcd_2();	// 예외처리 2
	}
}
