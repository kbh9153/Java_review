package sec04_BoundedType.Ex01;

class A {}
class B extends A {}
class C extends B {}

class D <T extends B> {		// B와 C만 올 수 있음
	private T t;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}

public class BoundedTypeOfGenericClass {

	public static void main(String[] args) {
//		D<A> d1 = new D<>();	// 불가능. class B와 B의 자식 클래스만 타입으로 지정 가능
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D();		// D<B> d2 = new D<>();와 같음. 타입 지정 생략시 범위 내 최상위 타입이 자동으로 지정
		
		d2.setT(new B());
		d2.setT(new C());
		
		B b = new B();
		C c = new C();
		d2.setT(b);
		d2.setT(c);
		
//		d3.setT(new B());	// 불가능. class C만 가능
		d3.setT(new C());
		
		d4.setT(new B());
		d4.setT(new C());
	}
}
