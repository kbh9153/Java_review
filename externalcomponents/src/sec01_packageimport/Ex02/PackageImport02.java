package sec01_packageimport.Ex02;

// 다른 패키지에 있는 클래스를 가져와 활용하는 방법 #2 : 임포트(import) 사용

import sec01_packageimport.common.A;
//import sec01_packageimport.common.*;	// * : common 패키지 하위에 있는 모든 파일들을 임포트 (하위 폴더는 임포트하지 않음)
// 자동 임포트 단축키 : ctrl + shift + o

public class PackageImport02 {
	
	public static void main(String[] args) {
		// #1. 객체 생성
		A a = new A();	// 정상동작
//		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
		
		// #2 멤버활용
		System.out.println(a.m);	// 3
		System.out.println(a.n);	// 4
		
		a.print();	// 임포트
	}
}
