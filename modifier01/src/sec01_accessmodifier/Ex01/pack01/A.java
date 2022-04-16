package sec01_accessmodifier.Ex01.pack01;

public class A {	// public이 있는 경우 다른 패키지에서 사용 가능. public이 없으면 기본적으로 default가 있지만 동일한 패키지에서만 사용 가능
	public int a = 1;
	protected int b = 2;
	int c = 3;	// default 지정자가 기본으로 있음 (생략된 상태)
	private int d = 4;
	
	public void print() {	// a, b, c, d 모두 사용 가능
		System.out.println(a);	// 가능
		System.out.println(b);	// 가능
		System.out.println(c);	// 가능
		System.out.println(d);	// 가능
	}
	
}
