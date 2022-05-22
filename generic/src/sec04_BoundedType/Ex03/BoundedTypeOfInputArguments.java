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
	void method1(Goods<A> g) {}		// case1 : �Ű����� Ÿ�� class A�� ����
	void method2(Goods<?> g) {}		// case2 : �Ű����� Ÿ�� class A, B, C, D ��� ����
	void method3(Goods<? extends B> g) {}		// case3 : �Ű����� Ÿ�� class B, C, D�� ����
	void method4(Goods<? super B> g) {}		// case4 : �Ű����� Ÿ�� class B�� �θ� Ŭ������ A ����
}

public class BoundedTypeOfInputArguments {

	public static void main(String[] args) {
		Test t = new Test();
		
		// #1. case1 (class A�� ����)
		t.method1(new Goods<A>());	// class A�� class B�� ��� ���������� Goods<A>�� Goods<B>�� �ƹ��� ���赵 �ƴϱ� ������ class A�� �Ű����� Ÿ������ ���� ����
//		t.method1(new Goods<B>());
//		t.method1(new Goods<C>());
//		t.method1(new Goods<D>());
		
		// #2. case2 (��� Ÿ�� ����)
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		// #3. case3 (class B, C, D ����)
//		t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		// #4. case4 (class B, A ����)
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());
	}
}
