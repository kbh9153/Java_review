package sec06_objectclass.Ex02;

class A {
	String name;
	A (String name) {
		this.name = name;
	}
}

class B {
	String name;
	B (String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {	// Object 클래스의 equals 메소드를 오버라이딩하여 재정의함
		if (obj instanceof B) {
			if (this.name == ((B)obj).name) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}

public class ObejctMethod_equals {
	
	public static void main(String[] args) {
		A a1 = new A("안녕");
		A a2 = new A("안녕");
		
		System.out.println(a1 == a2);	// false
		System.out.println(a1.equals(a2));	// false
		
		B b1 = new B("안녕");
		B b2 = new B("안녕");
		
		System.out.println(b1 == b2);	// false
		System.out.println(b1.equals(b2));	// true
	} 
}
