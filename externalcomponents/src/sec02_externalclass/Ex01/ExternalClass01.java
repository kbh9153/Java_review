package sec02_externalclass.Ex01;

// 외부클래스 정의 (외부클래스는 public을 정의할 수 없음) => public이 붙을 수 있는 클래스는 최대 1개

class A {
	int m = 3;
	int n = 4;
	
	void print() {
		System.out.println(m + ", " + n);
	}
}

public class ExternalClass01 {	// public이 붙은 클래스명 = java 파일명 
 
	public static void main(String[] args) {
		A a = new A();
		
		a.print();	// 3, 4
	}
}
