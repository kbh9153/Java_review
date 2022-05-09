package sec02_createandstartthread.Ex03;

// #1. 방법 2(M2). Runnable 인터페이스 상속하여 클래스 생성 case1 : 2개의 스레드 생성
class SMIFileRunnable implements Runnable {
	@Override
	public void run() {
		// #2. 자막번호 하나 ~ 다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		
		// #4. 자막번호 출력
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막번호) : " + strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M2C1 {

	public static void main(String[] args) {
		// SMIRunnable
		Runnable smiFileThread = new SMIFileRunnable();
		Thread thread = new Thread(smiFileThread);	// Runnable에는 start()가 없기 때문에 Thread에게 전달
		
		thread.start();
		
		// #1. 비디오프레임 1 ~ 5
		int[] array = {1, 2, 3, 4, 5};
				
		// #3. 비디오프레임 출력
		for (int i = 0; i < array.length; i++) {
			System.out.print("(비디오프레임) : " + array[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
