package sec01_typeofexception.Ex01;

class A {	// extends Object
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class CheckedException {

	public static void main(String[] args) {
		// # Check Exception (일반 예외) : 컴파일 전 문법 체크. 필수적으로 예외 처리해야함
		
		// #1. InterruptedException : 스레드 예외
//		Thread.sleep(1000);
		
		// #2. ClassNotFoundException : 클래스를 찾지 못할 때 발생할 수 있는 예외
//		Class cls = Class.forName("java.lang.Object");
		
		// #3. IOException : 입력, 출력시 발생할 수 있는 예외
//		InputStreamReader in = new InputStreamReader(System.in);
//		in.read();
		
		// #4. FileNotFoundException
//		FileInputStream fis = new FileInputStream("text.txt");
		
		// #5. CloneNotSuppetedException
//		A a1 = new A();
//		A a2 = (A)a1.clone();
		
	}
}
