package sec03_threadproperties.Ex01;

// # 스레드 객체 가져오기, 이름설정, 스레드 수
public class ThreadProperties01 {

	public static void main(String[] args) {
		// #1. 객체 참조하기 (currentThread()) / 스레드 수 (activeCount())
		Thread curThread = Thread.currentThread();
		System.out.println("현재 스레드의 이름 : " + curThread.getName());	// Thread 클래스 내 인스턴스 메소드 getName()임 
		System.out.println("동작하는 스레드 수 : " + Thread.activeCount());	// Thread 클래스 내 static activeCount()임
		System.out.println(Thread.activeCount());
		
		System.out.println();
		
		// #2. 스레드 이름 지정 (자동지정)
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());	// 컴파일러가 자동으로 지정해준 스레드 이름 출력
			thread.start();
		}
		
		System.out.println();
		
		// #3. 스레드 이름 직접 지정
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			thread.setName(i + "번째 스레드");	
			System.out.println(thread.getName());	// Thread-6, 7, 8 출력
			thread.start();
		}
		
		System.out.println();
		
		// #4. 스레드 이름 지정 (자동지정)
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());	// 컴파일러가 자동으로 지정해준 스레드 이름 출력
			thread.start();
		}
		
		// #5. 스레드 수
		System.out.println("동작하는 스레드 수 : " + Thread.activeCount());	// 현재 이 시점의 동작중인 스레드의 수만 출력. 모든 스레드 수를 출력하는 것은 아님
	}
}
