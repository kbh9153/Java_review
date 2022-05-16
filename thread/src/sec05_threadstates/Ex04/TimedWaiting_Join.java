package sec05_threadstates.Ex04;

class MyThread1 extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 1000000000L; i++) {}
	}
}

class MyThread2 extends Thread {
	MyThread1 myThread1;
	public MyThread2(MyThread1 myThread1) {
		this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
		try {
			myThread1.join(3000);	// join은 최대 설정 시간까지 양보 (ex. 3초를 설저했는데 2초만에 끝나면 양보가 종료)
		} catch (InterruptedException e) {
			System.out.println(" -- join(...) 진행 중 interrupt() 발생");
			for (long i = 0; i < 1000000000L; i++) {}	// 시간지연
		}
	}
}

public class TimedWaiting_Join {
	
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		
		myThread1.start();
		myThread2.start();	
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		
		System.out.println("MyThread1 State = " + myThread1.getState());	// RUNNABLE
		System.out.println("MyThread2 State = " + myThread2.getState());	// TIMED_WAITTING
		
		myThread2.interrupt();	// 강제 InterruptedException 발생 (TIMED_WAITTING 상태만 interrupt 가능)
		
		System.out.println("MyThread1 State = " + myThread1.getState());	// RUNNABLE
		System.out.println("MyThread2 State = " + myThread2.getState());	// RUNNABLE
	}
}
