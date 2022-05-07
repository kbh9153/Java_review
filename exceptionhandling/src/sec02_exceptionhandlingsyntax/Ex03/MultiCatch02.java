package sec02_exceptionhandlingsyntax.Ex03;

public class MultiCatch02 {
	
	public static void main(String[] args) {
		// #1. catch 블록이 순서가 잘못된 경우
//		try {
//			System.out.println(3/1);
//			int num = Integer.parseInt("10A");
//		} catch(Exception e) {
//			System.out.println("숫자는 0으로 나눌 수 없습니다.");
//		} catch(NumberFormatException e) {
//			System.out.println("숫자로 바꿀 수 없습니다.");
//		} finally {
//			System.out.println("프로그램 종료");
//		}
		
		// #2. catch 블록의 올바른 순서 => catch 블록은 위에서부터 차례대로 실행. 첫번째 예외처리되면 다음 예외처리는 실행되지 않음
			// => 큰 범위의 예외처리를 아래에 위치시켜야함
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");
		} catch(NumberFormatException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		} catch(Exception e) {
			System.out.println("숫자로 바꿀 수 없습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
