package sec02_exceptionhandlingsyntax.Ex01;

public class TryCatchFinally {

	public static void main(String[] args) {
		// #1. try-catch
		try {
			System.out.println(3/0);	// 실행예외 발생(ArithmeticException)
			System.out.println("프로그램 종료");
		} catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
			System.out.println("프로그램 종료");
		}
		
		// #2. try-catch-finally
		try {
			System.out.println(3/0);	// 실행예외 발생(ArithmeticException)
		} catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		} finally {		// finally는 항상 1번만 사용 가능
			System.out.println("프로그램 종료");
		}
	}
}
