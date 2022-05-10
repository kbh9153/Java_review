package sec03_threadproperties.Ex02;

// # 스레드 우선순위

class MyThread extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 1000000000; i++) {}	// 시간 지연용. 단순히 Thread.sleep()의 경우에는 스레드가 중지되어 쉬고있는 경우
		System.out.println(getName() + "우선수위 : " + getPriority());		// this.가 생략
	}
}
	
public class ThreadProperties02 {

	public static void main(String[] args) {
		// # 참고. 현재 PC의 CPU 코어 수
		System.out.println("코어 수 : " + Runtime.getRuntime().availableProcessors());
		
		// #1. 디폴트 우선순위
		for (int i = 0; i < 3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		// #2. 우선순위를 직접 지정
		for (int i = 0; i < 10; i++) {
			Thread thread = new MyThread();
			thread.setName(i + "번째 스레드");
			if (i == 7) {
				thread.setPriority(10);	// 우선순위는 0 ~ 10이 있음. 높을수록 일찍 실행
			}
			thread.start();
		}
		
	}
}
