package sec02_loopcontrolstatement;

public class Quiz {

	public static void main(String[] args) {
		// #Q3
		for (int i = 0; ; i++) {
			if (i > 10) {
				break;
			} else if (i % 2 == 1) {
				continue;
			} else {
				System.out.println(i);
			}
		}
		System.out.println();
		
		// #Q4
		int a1 = 10;
		while (a1 > 0) {
			System.out.println(a1);
			a1-=2;
		}
		System.out.println();
		
		// #Q6, Q7
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3 && j == 2) {
					i = 100;
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();
		
		out: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3 && j == 2) {
					break out;
				}
				System.out.println(i + ", " + j);
			}
		}
	}
}
