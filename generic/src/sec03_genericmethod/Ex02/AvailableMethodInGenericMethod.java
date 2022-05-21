package sec03_genericmethod.Ex02;

class A {
	public <T> void method(T t) {
//		System.out.println(t.length());		// 불가능 : Object 메소드만 호출 가능
		System.out.println(t.equals("안녕하세요"));	// Object 메소드만 호출 가능
	}
}

public class AvailableMethodInGenericMethod {
	
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("안녕하세요");
	}
}
