package sec02_createandstartthread.Ex02;

// #1. 방법 1(M1). Thread 클래스 상속하여 클래스 생성 case2 : 3개의 스레드 생성
class SMIFileThread extends Thread {
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

class VideoFileThread extends Thread {
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

public class CreateAndStartThread_M1C2 {

	public static void main(String[] args) {
		// #5. SMIFileThread 객체 생성 및 시작
//		SMIFileThread smiFileThread = new SMIFileThread();
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		
		// #6. VideoFileThread 객체 생성 및 시작
//		Thread VideoFileThread = new VideoFileThread();
		VideoFileThread videoFileThread = new VideoFileThread();
		videoFileThread.start();
	}
}
