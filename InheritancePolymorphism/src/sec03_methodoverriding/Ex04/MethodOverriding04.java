package sec03_methodoverriding.Ex04;

class A {
	protected void abc() {}
}

class B1 extends A {
	@Override
	public void abc() {}
}

class B2 extends A {
	@Override
	protected void abc() {}
}

class B3 extends A {
//	void abc() {}	// 접근 지정자 default (부모 클래스보다 접근 지정자 범위가 좁아서 오류 발생)
}

class B4 extends A {
//	private void abc() {}	// 접근 지정자 private (부모 클래스보다 접근 지정자 범위가 좁아서 오류 발생)
}

public class MethodOverriding04 {

	public static void main(String[] args) {
		
	}
}
