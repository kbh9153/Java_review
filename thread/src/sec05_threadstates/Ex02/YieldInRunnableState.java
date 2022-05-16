package sec05_threadstates.Ex02;

class MyThread extends Thread {
	boolean yieldFlag;
	
	@Override
	public void run() {
		while (true) {
			if (yieldFlag) {
				Thread.yield();		// yieldFlag가 true일 때 스레드를 양보
			} else {
				System.out.println(getName() + "실행");
				for (long i = 0; i < 1000000000L; i++) {}	// 시간지연
			}
		}
	}
}

public class YieldInRunnableState {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		
		thread1.setName("thread1");
		thread1.yieldFlag = false;
		thread1.setDaemon(true);	// while 무한루프가 종료되지 않아 데몬 스레드 설정
		thread1.start();
		
		MyThread thread2 = new MyThread();
		
		thread2.setName("thread2");
		thread2.yieldFlag = true;
		thread2.setDaemon(true);
		thread2.start();

		// #1. 6초 지연 (1초마다 한번씩 양보)
		for (int i = 0; i < 6; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			thread1.yieldFlag = !thread1.yieldFlag;	// thread1 1초마다 true, false 변환
			thread2.yieldFlag = !thread2.yieldFlag;	// thread2 1초마다 true, false 변환
		}
		
	}
}
