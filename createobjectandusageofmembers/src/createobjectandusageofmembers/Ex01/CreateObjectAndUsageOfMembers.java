package createobjectandusageofmembers.Ex01;

// #1. 클래스의 구성 (정의) : 붕어빵 기계

class A {
	int m = 3;	// 필드
	
	void print() {	// 메소드
		System.out.println("객체의 생성 및 활용");
	}
}

public class CreateObjectAndUsageOfMembers {
	
	public static void main(String[] args) {
		// #2. 클래스로부터 객체 생성 : 붕어빵
		A a = new A();
		
		// #3. 클래스 멤버 활용 (필드활용 : 필드의 값을 읽기/쓰기, 메소드를 활용 : 메소르를 호출) : 붕어빵을 먹기
		a.m = 7;
		System.out.println(a.m);	// 7
		
		a.print();
	}

}
