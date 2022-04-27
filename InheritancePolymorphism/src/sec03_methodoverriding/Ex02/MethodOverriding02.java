package sec03_methodoverriding.Ex02;

class Animal {
	void cry() {}
}

class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("새는 짹짹");
	}
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("개는 멍멍");
	}
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("고양이는 야옹");
	}
}

public class MethodOverriding02 {

	public static void main(String[] args) {
		// #1. 각각의 타입으로 선언 + 각각의 타입으로 생성
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		
		// #2. Animal 타입으로 선언 + 자식 클래스 타입으로 생성
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		ab.cry();	// 새는 짹짹
		ac.cry();	// 고양이는 야옹
		ad.cry();	// 개는 멍멍
		
		// #3. 배열로 관리
		Animal[] animals = new Animal[] {new Bird(), new Cat(), new Dog()};
		for (Animal animal : animals) {
			animal.cry();
		}
		
		Animal[] animals2 = new Animal[] {ab, ac, ad};
		for (Animal animal : animals2) {
			animal.cry();
		}
	}
}
