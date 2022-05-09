package sec02_createandstartthread.Ex04;

//#1. 방법 2(M2). Runnable 인터페이스 상속하여 클래스 생성 case2 : 3개의 스레드 생성
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

class VideoFileRunnable implements Runnable {
	@Override
	public void run() {
		// #1. 비디오프레임 1 ~ 5
		int[] array = {1, 2, 3, 4, 5};
				
		// #3. 비디오프레임 출력
		for (int i = 0; i < array.length; i++) {
			System.out.print("(비디오프레임) : " + array[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M2C2 {

	public static void main(String[] args) {
		// SMIRunnable 객체 생성
		Runnable smiFileThread = new SMIFileRunnable();
		Thread thread1 = new Thread(smiFileThread);
		
		// VideoRunnable 객체 생성
		Runnable VideoFileThread = new VideoFileRunnable();
		Thread thread2 = new Thread(VideoFileThread);
		
		thread1.start();
		thread2.start();
	}
}
