package sec03_overlappedcontrolstatement.Ex01;

public class OverlappedControlStatement {

	public static void main(String[] args) {
		// #1. if - if 중복
		int value1 = 5;
		int value2 = 3;
		
		if (value1 > 5) {
			if (value2 < 2) {
				System.out.println("실행 1");
			} else {
				System.out.println("실행 2");
			}
		} else {
			System.out.println("실행 3");
		}
		// #2. switch - for 중복
		int value3 = 2;
		switch (value3) {
			case 1:
				for (int k = 0; k < 10; k++) {
					System.out.print(k + " ");
				}
				break;
				
			case 2:
				for (int k = 10; k > 0; k--) {
					System.out.print(k + " ");
				}
				break;
		}
		System.out.println();
		
		// #3. for - for - if 중복
		for (int i = 0; i < 3; i++) {	// 3바퀴
			for (int j = 0; j < 5; j++) {	// 5바퀴
				System.out.println(i + " " + j);
				if (i == j)	{
					System.out.println("i = j");
				}
			}
		}
		System.out.println();
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i == j) {
					System.out.print(i + " " + j);
					System.out.println(" i = j");
				} else {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}
