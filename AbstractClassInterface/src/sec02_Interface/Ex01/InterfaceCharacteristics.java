package sec02_Interface.Ex01;

interface A {
	public static final int a = 3;	// 인터페이스 필드에는 public static final 키워드가 무조건 작성되야함
	public abstract void abc();	 // 인터페이스 메소드에는 public abstract 키워드가 무조건 작성되어야함
}

interface B {
	int b = 3;	// public static final을 생략하여도 컴파일러가 자동으로 추가
	void bcd();	 // public abstract를 생략하여도 컴파일러가 자동으로 추가
}

public class InterfaceCharacteristics {

	public static void main(String[] args) {
		// #1. static 자동 추가 체크
		System.out.println(A.a);
		System.out.println(B.b);
		
		// #2. final 자동 추가 체크
//		A.a = 5;	// final 때문에 추가적인 값의 대입이 불가능
//		B.b = 5;	// final 자동으로 추가되어 추가적인 값의 대입이 불가능
	}
}
