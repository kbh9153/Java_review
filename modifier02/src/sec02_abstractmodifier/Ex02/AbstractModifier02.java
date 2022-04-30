package sec02_abstractmodifier.Ex02;

// 추상클래스/추상메소드 사용하는 경우
abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

public class AbstractModifier02 {

	public static void main(String[] args) {
		// #1. 객체생성
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		// #2. 메소드 호출
		animal1.cry();	// 야옹
		animal2.cry();	// 멍멍
	}
}
