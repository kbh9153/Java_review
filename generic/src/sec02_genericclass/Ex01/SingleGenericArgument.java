package sec02_genericclass.Ex01;

class MyClass<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class SingleGenericArgument {

	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>();
		mc1.setT("안녕하세요");
		
		MyClass<Integer> mc2 = new MyClass<>();	// 생성자 부분에서는 타입 생략 가능(클래스 부분에서 명시하였기 때문)
		mc2.setT(31);
		
//		MyClass<Integer> mc3 = new MyClass<>();
//		mc3.setT("안녕");	// 오류발생. 강한 타입체크

		System.out.println(mc1.getT());
		System.out.println(mc2.getT());
		
		
		
	}
}
