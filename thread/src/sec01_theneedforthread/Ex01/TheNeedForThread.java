package sec01_theneedforthread.Ex01;

public class TheNeedForThread {

	public static void main(String[] args) {
		// #1. 비디오프레임 1 ~ 5
		int[] array = new int[] {1, 2, 3, 4, 5};
		
		// #2. 자막번호 하나 ~ 다섯
		String[] strArray = new String[] {"하나", "둘", "셋", "넷", "다섯"};
		
		// #3. 비디오프레임 출력
		for (int i = 0; i < array.length; i++) {
			System.out.println("(비디오프레임) " + array[i]);
			try {Thread.sleep(100);} catch (InterruptedException e) {}
		}
		
		// #4. 자막번호 출력
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("(자막번호) " + strArray[i]);
			try {Thread.sleep(100);} catch (InterruptedException e) {}
		}
	}
}
