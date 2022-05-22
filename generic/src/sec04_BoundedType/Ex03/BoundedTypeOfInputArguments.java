package sec04_BoundedType.Ex03;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

class Goods<T> {
	private T t;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}

class Test {
	void method1(Goods<A> g) {}		// case1 : 매개변수 타입 class A만 가능
	void method2(Goods<?> g) {}		// case2 : 매개변수 타입 class A, B, C, D 모두 가능
	void method3(Goods<? extends B> g) {}		// case3 : 매개변수 타입 class B, C, D만 가능
	void method4(Goods<? super B> g) {}		// case4 : 매개변수 타입 class B와 부모 클래스인 A 가능
}

public class BoundedTypeOfInputArguments {

	public static void main(String[] args) {
		Test t = new Test();
		
		// #1. case1 (class A만 가능)
		t.method1(new Goods<A>());	// class A와 class B는 상속 관계이지만 Goods<A>와 Goods<B>는 아무런 관계도 아니기 때문에 class A만 매개변수 타입으로 지정 가능
//		t.method1(new Goods<B>());
//		t.method1(new Goods<C>());
//		t.method1(new Goods<D>());
		
		// #2. case2 (모든 타입 가능)
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		// #3. case3 (class B, C, D 가능)
//		t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		// #4. case4 (class B, A 가능)
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());
	}
}
