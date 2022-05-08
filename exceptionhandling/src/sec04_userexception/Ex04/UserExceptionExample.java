package sec04_userexception.Ex04;

// #점수가 음수인 경우에 예외발생
class MinusException extends Exception {
	public MinusException() {
		super();
	}
	
	public MinusException(String message) {
		super(message);
	}
}

// #점수가 100점을 초과하는 경우예 예외발생
class OverException extends Exception {
	public OverException() {
		super();
	}
	
	public OverException(String message) {
		super(message);
	}
}

class A {
	void checkScore(int num) throws MinusException, OverException {
//		if (num >= 0 && num <= 100) {
//			System.out.println("정상입력");
//		} else if (num < 0) {
//			throw new MinusException("예외발생 : 음수값 입력");
//		} else if (num > 100) {
//			throw new OverException("예외발생 : 100점 초과 입력");
//		}
		
		if (num < 0) {
			throw new MinusException("예외발생 : 음수값 입력");
		} else if (num > 100) {
			throw new OverException("예외발생 : 100점 초과 입력");
		} else {
			System.out.println("정상 입력");
		}
	}
}

public class UserExceptionExample {
	
	public static void main(String[] args) {
		A a = new A();
		
		try {
			a.checkScore(85);
//			a.checkScore(120);
			a.checkScore(-10);
		} catch(MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
	}
}
