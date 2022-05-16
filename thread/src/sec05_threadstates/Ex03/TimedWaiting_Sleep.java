package sec05_threadstates.Ex03;

class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(" -- sleep() 진행 중 Interrupt() 발생");
			for (long i = 0; i < 1000000000L; i++) {}
		}
	}
}

public class TimedWaiting_Sleep {
	
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();	// start 기능 : CPU 사용하기 위한 메모리 할당 등 준비, run 메소드 호출
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}	// CPU를 사용 준비를 위한 sleep
		System.out.println("MyThread State = " + myThread.getState());	// TIMED_WAITING (스레드가 일시정지된 상태)
		
		myThread.interrupt();	// 강제 InterruptedException 발생 (TIMED_WAITTING 상태만 interrupt 가능)
		try {Thread.sleep(100);} catch (InterruptedException e) {}	// CPU를 사용 준비를 위한 sleep
		System.out.println("MyThread State = " + myThread.getState());	// RUNNABLE
	}
}
