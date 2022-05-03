package sec01_typeofexception.Ex02;

class A {}

class B extends A {}

public class UncheckedException {

	public static void main(String[] args) {
		// # UncheckedException (실행 예외) : RuntimeException. 실행시 오류 발생. 예외 처리하지 않으면 오류 정보를 출력 후 프로그램 종료 
		
		// #1. ArithmeticException
//		System.out.println(3/0);
		
		// #2. ClassCastException
//		A a = new A();
//		B b = (B)a;
		
		// #3. ArrayIndexOutOfBoundException
//		int[] array = new int[] {1, 2, 3};
//		System.out.println(array[3]);
		
		// #4. NumberFormatException
//		int num = Integer.parseInt("10A");
		
		// #5. NullPointerException
//		String str = null;
//		System.out.println(str.charAt(2));
	}
	
}
