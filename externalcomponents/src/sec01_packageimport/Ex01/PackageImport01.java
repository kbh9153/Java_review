package sec01_packageimport.Ex01;

// 다른 패키지에 있는 클래스를 가져와 활용하는 방법 #1 : 클래스의 풀네임 사용

public class PackageImport01 {
	
	public static void main(String[] args) {
//		A a = new A();	// 오류 발생
		
		// #1. 객체 생성
		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
		
		// #2. 멤버활용
		System.out.println(a.m);	// 3
		System.out.println(a.n);	// 4
		
		a.print();	// 임포트
	}
}
