package sec02_typecasting.Ex03;

class A {}
class B extends A {}

public class TypeCasting03 {

	public static void main(String[] args) {
		// #1. instanceof : 캐스팅 가능 여부 확인
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A);	// true
		System.out.println(ab instanceof A);	// true
		
		System.out.println(aa instanceof B);	// false
		System.out.println(ab instanceof B);	// true
		
		if (ab instanceof B) {
			B b = (B)ab;
			System.out.println("ab를 B 타입으로 다운캐스팅 가능");
		} else {
			System.out.println("ab를 B 타입으로 다운캐스팅 불가능");
		}
		
		if (aa instanceof B) {
			B bb = (B)aa;
			System.out.println("aa를 B 타입으로 다운캐스팅 가능");
		} else {
			System.out.println("aa를 B 타입으로 다운캐스팅 불가능");
		}
		
		if ("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스입니다.");
		}
	}
}
