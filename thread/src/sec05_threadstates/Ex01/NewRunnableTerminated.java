package sec05_threadstates.Ex01;

public class NewRunnableTerminated {

	public static void main(String[] args) {
		// # 스레드 상태 저장 클래스
		Thread.State state;
		
		// #1. 객체 생성 (NEW)
		Thread thread = new Thread() {
			@Override
			public void run() {
				for (long i = 0; i < 1000000000L; i++) {}	// 시간지연 역할
			}
		};
		
		state = thread.getState();
		System.out.println("Thread state = " + state);	// NEW (객체가 생성된 상태)
		
		// #2. 스레드 시작
		thread.start();
		state = thread.getState();
		System.out.println("Thread state = " + state);	// RUNNABLE (실행 중인 상태)
		
		// #3. 스레드 종료
		try {thread.join();} catch (InterruptedException e) {}	// main ->  thread에게 스레드 전달 (thread의 작업이 다 끝나야 main thread가 작업)
		
		state = thread.getState();
		System.out.println("Thread state = " + state);	// TERMINATED (종료된 상태)
	}
}
