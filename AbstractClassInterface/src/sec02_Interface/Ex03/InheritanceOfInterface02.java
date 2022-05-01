package sec02_Interface.Ex03;

// 접근지정자 : 상속시 자식은 부모보다 접근지정자의 범위가 같거나 넓어야함. 접은 경우 오류 발생
interface A {
	public abstract void abc();
}

interface B {
	void bcd();		// public abstract가 생략된 상태. 컴파일러가 자동으로 추가
}

class C implements A {
	@Override
	public void abc() {}	// 부모 인터페이스의 abc 메소드보다 접근지정자가 같거나 넓어야함. 부모가 public이기 때문에 자식은 무조건 public
}

//class D implements B {
//	void bcd() {};	// 부모 인터페이스의 bcd 메소느는 접근 지정자가 public(public abstract가 생략된 상태). 자식 클래스의 bcd 메소드는 접근 지정자가 default이기 때문에 오류 발생
//}

public class InheritanceOfInterface02 {

	public static void main(String[] args) {
		
	}
}
