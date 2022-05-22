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
	public <T extends MyInterface> void method2(T t) {		// ����! ���׸� Ÿ�� ���ѿ����� interfacee�� ����� ���� implements�� �ƴ� extends�� ���
		t.print();
	}
}

public class BoundedTypeOfGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		
//		a.<Integer>method1("�ȳ��ϼ���");		// String���� Ÿ�� ���� 
		a.<String>method1("�ȳ��ϼ���");
		
		B b = new B();
		
		b.method2(new MyInterface() {		// MyInterface�� ������ Ŭ������ ��ü�� �;���
			@Override
			public void print() {
				System.out.println("print() ����");
			}; 
		});	
	}
}
