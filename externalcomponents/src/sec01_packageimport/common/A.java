package sec01_packageimport.common;

public class A {	// 다른 패키지에서 임포트하여 사용하려면 클래스와 클래스 멤버(필드, 메소드, 이너클래스) 앞에 꼭 public이 붙어야함 
	public int m = 3;
	public int n = 4;
	
	public void print() {
		System.out.println("임포트");
	}
}
