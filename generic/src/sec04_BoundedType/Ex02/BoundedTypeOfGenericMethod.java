package sec04_BoundedType.Ex02;

class A {
	public <T extends String> void method1(T t) {
		System.out.println(t.charAt(0));
	}
}

interface MyInterface {
	public abstract void print();
}

class B {
	public <T extends MyInterface> void method2(T t) {		// 주의! 제네릭 타입 제한에서는 interfacee를 사용할 때도 implements가 아닌 extends를 사용
		t.print();
	}
}

public class BoundedTypeOfGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		
//		a.<Integer>method1("안녕하세요");		// String으로 타입 제한 
		a.<String>method1("안녕하세요");
		
		B b = new B();
		
		b.method2(new MyInterface() {		// MyInterface를 구현한 클래스의 객체가 와야함
			@Override
			public void print() {
				System.out.println("print() 구현");
			}; 
		});	
	}
}
