package sec02_exceptionhandlingsyntax.Ex06;

class A implements AutoCloseable {
	String resource;
	A(String resource) {
		this.resource = resource;
	}
	
	void abc() throws Exception {
		
	}

	@Override
	public void close() throws Exception {
		if (resource != null) {
			resource = null;
			System.out.println("리소스가 해제되었습니다.");
		}
	}
}

public class TryWithResource02 {
	
	public static void main(String[] args) {
		// 리소스를 해제하기 위해서는 객체 안에 AutoCloseable 인터페이스를 상속받아 close()가 필수로 포함되어있어야 함
		
		// #1. 리소스를 사용하고 finally에서 리소스 수동 해제하기
		A a1 = null;
		
		try {
			a1 = new A("특정파일");
			a1.abc();
		} catch(Exception e) {
			System.out.println("예외처리");
		} finally {
			// 리소스 수동 해제
			if (a1.resource != null) {
				try {
					a1.close();
				} catch(Exception e) {}
			}
		}
		
		// #2. 자동 리소스 해제
		try(A a2 = new A("특정파일");) {
			a1.abc();
		} catch(Exception e) {
			System.out.println("예외처리");
		}
	}
}
