package sec03_threadproperties.Ex05;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + (isDaemon() ? "데몬스레드" : "일반스레드"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + " : " + i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class ThreadProperties03_3 {
	
	public static void main(String[] args) {
		// #1. 일반스레드 : 일반스레드는 모든 스레드가 작업완료되어야 종료(메인스레드가 종료되어도 계속 작업 진행할 수 있음)
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);	// 데몬스레드는 false가 기본 설정값
		thread1.setName("thread1");
		thread1.start();
		
		// #2. 데몬스레드 : 데몬스레드는 일반스레드(메인스레드 포함)가 모두 종료되면 진행중인 작업도 중단하고 종료
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		// #3. 3초 후 main Thread 종료
		try {Thread.sleep(3100);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료");
		
	}
}
