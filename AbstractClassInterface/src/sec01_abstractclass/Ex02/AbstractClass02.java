package sec01_abstractclass.Ex02;

// 추상클래스의 객체 생성 방법 #2 (익명이너클래스를 이용하여 객체 생성)
	// 객체를 딱 한번만 생성할 때는 익명이너클래스가 편리함
abstract class A {
	abstract void abc();		
}

public class AbstractClass02 {

	public static void main(String[] args) {
		// #1. 객체 생성
		A a1 = new A() {
			@Override
			void abc() {
				System.out.println("방법 #2. 익명이너클래스 방법으로 객체 생성");
			}
		};
		
		A a2 = new A() {
			@Override
			void abc() {
				System.out.println("방법 #2. 익명이너클래스 방법으로 객체 생성");
			}
		};
		
		// #2. 메소드 호출
		a1.abc();	// 방법 #2. 익명이너클래스 방법으로 객체 생성
		a2.abc();	// 방법 #2. 익명이너클래스 방법으로 객체 생성
	}
}
