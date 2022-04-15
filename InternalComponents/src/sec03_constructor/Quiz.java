package sec03_constructor;

class A {
	void print() {
		System.out.println("입력값이 없습니다.");
	}
	
	void print(int a) {
		System.out.println("정수 입력값 : " + a);
	}
	
	void print(double a) {
		System.out.println("실수 입력값" + a);
	}
	
	void print(String a) {
		System.out.println("문자열 입력값 : " + a);
	}
}

public class Quiz {
	
	public static void main(String[] args) {
		// #Q2
		A a = new A();
		
		a.print();
		a.print(3);
		a.print(5.8);
		a.print("안녕");
	}
}
