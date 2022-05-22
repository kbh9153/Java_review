package sec05_inheritanceofgeneric.Ex02;

class Parent {
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parent {
	
}

public class InheritanceGenericMethod {

	public static void main(String[] args) {
		// #1. �θ�Ŭ���� ���׸��޼ҵ� �̿�
		Parent p = new Parent();
		p.<Integer>print(10);
		p.print(21);
		
		// #2. �ڽ�Ŭ���� ���׸��޼ҵ� �̿�
		Child c = new Child();
		c.<Double>print(3.1);
		c.print(3.1);
	}
}
