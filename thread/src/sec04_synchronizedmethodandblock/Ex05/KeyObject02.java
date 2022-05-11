package sec04_synchronizedmethodandblock.Ex05;

class MyData {
	synchronized void abc() {	// 메소드 동기화는 키가 무조건 this
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	
	synchronized void bcd() {	// 메소드 동기화는 키가 무조건 this
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	
	void cde() {
		synchronized(new Object()) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "번째");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		}
	}
}

public class KeyObject02 {

	public static void main(String[] args) {
		// # 공유 객체
		MyData myData = new MyData();
		
		// # 세개의 스레드가 각각의 메소드 호출
		new Thread() {
			@Override
			public void run() {
				myData.abc();
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				myData.bcd();
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				myData.cde();
			}
		}.start();
	}
}
