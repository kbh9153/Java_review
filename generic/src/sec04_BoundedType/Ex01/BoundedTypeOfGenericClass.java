package sec04_BoundedType.Ex01;

class A {}
class B extends A {}
class C extends B {}

class D <T extends B> {		// B�� C�� �� �� ����
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
//		D<A> d1 = new D<>();	// �Ұ���. class B�� B�� �ڽ� Ŭ������ Ÿ������ ���� ����
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D();		// D<B> d2 = new D<>();�� ����. Ÿ�� ���� ������ ���� �� �ֻ��� Ÿ���� �ڵ����� ����
		
		d2.setT(new B());
		d2.setT(new C());
		
		B b = new B();
		C c = new C();
		d2.setT(b);
		d2.setT(c);
		
//		d3.setT(new B());	// �Ұ���. class C�� ����
		d3.setT(new C());
		
		d4.setT(new B());
		d4.setT(new C());
	}
}
