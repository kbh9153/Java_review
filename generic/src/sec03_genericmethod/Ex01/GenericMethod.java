package sec03_genericmethod.Ex01;

// 제네릭 메소드 : 일반 클래스 안에 제네릭 메소드 (메소드를 사용할 때 타입을 명시)
class GenericMethods {
	public <T> T method1(T t) {
		return t;
	}
	
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K, V> void method3(K k, V v) {
		System.out.println(k + " : " + v);
	}
}

public class GenericMethod {

	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.method1("안녕");	// 제네릭 타입 생략 가능. 동일한 결과 출력됨
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(gm.<String>method1("출력 방법"));
		System.out.println(gm.method1("출력 방법"));
		
		boolean bool1 = gm.<Double>method2(2.5, 2.5);
		boolean bool2 = gm.method2(2.5, 2.5);
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		gm.<String, Integer>method3("국어", 80);
		gm.method3("국어", 80);	// "국어" 값은 String, 80은 Integer 타입인 것을 유추할 수 있기 때문에 타입 명시를 생략할 수 있음
	}
}
