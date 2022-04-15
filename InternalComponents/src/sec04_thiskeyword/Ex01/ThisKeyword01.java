package sec04_thiskeyword.Ex01;

// #1. 클래스의 정의, 클래스 내부에서 필드, 메소드에 붙는 자동으로 this 키워드

class A {
	int m;
	int n;
	
	void init(int a, int b) {
		int c;
		c = 3;	// 지역변수는 this가 붙지 않음
		m = a;	// this.m
		n = b;	// this.n
	}
	
	void work()	{
		init(2, 3);	// this.init(2, 3)
	}
}

public class ThisKeyword01 {
	
	public static void main(String[] args) {
		// #2. 클래스 객체 생성
		A a = new A();
		
		// #3. 메소드 호출 / 필드값 활용
		a.work();
		System.out.println(a.m);	// 2
		System.out.println(a.n);	// 3
	}
}
