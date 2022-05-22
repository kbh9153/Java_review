package sec05_inheritanceofgeneric.Ex01;

class Parent<T> {
	T t;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}

class Child1<T> extends Parent<T> {		// 자식 클래스는 부모 클래스의 타입 범위보다 같거나 커야함
	
}

class Child2<T, V> extends Parent<T> {
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
}

public class InheritanceGenericClass {

	public static void main(String[] args) {
		// #1. 부모 제네릭 클래스
		Parent<String> p = new Parent<>();
		p.setT("부모 제네릭 클래스");
		System.out.println(p.getT());
		
		// #2. 자식 클래스 1
		Child1<String> c1 = new Child1<>();
		c1.setT("자식1 제네릭 클래스");
		System.out.println(c1.getT());
		
		// #3. 자식 클래스 2
		Child2<String, Integer> c2 = new Child2<>();
		c2.setT("자식2 제네릭 클래스");
		c2.setV(31);
		System.out.println(c2.getT());
		System.out.println(c2.getV());
	}
}
