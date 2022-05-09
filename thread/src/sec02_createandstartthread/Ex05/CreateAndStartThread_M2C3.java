package sec02_createandstartthread.Ex05;

//#1. 방법 2(M2). Runnable 익명이너클래스 생성 case3 : 3개의 스레드 생성
public class CreateAndStartThread_M2C3 {
	 
	public static void main(String[] args) {
		// Thread 객체 생성(비디오프레임)
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				int[] array = new int[] {1, 2, 3, 4, 5};
				
				for (int i = 0; i < array.length; i++) {
					System.out.print("(비디오프레임) " + array[i]);
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		// Thread 객체 생성(자막번호)
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] strArray = new String[] {"하나", "둘", "셋", "넷", "다섯"};
				try {Thread.sleep(10);} catch (InterruptedException e) {}
				
				for (int i = 0; i < strArray.length; i++) {
					System.out.println(" - (자막번호) " + strArray[i]);
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		});
		
		// Thread 실행
		thread1.start();
		thread2.start();
	}
}
