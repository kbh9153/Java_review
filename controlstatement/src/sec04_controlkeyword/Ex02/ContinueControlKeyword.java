package sec04_controlkeyword.Ex02;

public class ContinueControlKeyword {

	public static void main(String[] args) {
		// #1. 단일 loop에서의 continue
		for (int i = 0; i < 10; i++) {
			continue;
			// System.out.print(i + " ");
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			continue;
		}	// 0 ~ 9
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		} // 0, 1, 2, 3, 4, 6, 7, 8, 9 => 5는 출력하지 않고 지나침
		System.out.println();
		System.out.println();
		
		System.out.println("<< while문으로 변환 >>");
		int a1 = 0;
		while (a1 < 10) {
			if (a1 == 5) {
				a1++;
				continue;
			}
			System.out.print(a1 + " ");
			a1++;
		}
		
		System.out.println();
		System.out.println();
		
		// #2. 다중(이중) loop에서의 continue
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					continue;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();
		
		System.out.println("<< while문으로 변환 >>");
		int b1 = 0;
		while (b1 < 5) {
			int b2 = 0;
			while(b2 < 5) {
				if (b2 == 2) {
					b2++; 
					b1++;
					continue;
				}
				System.out.println(b1 + ", " + b2);
				b2++;
			}
		}
		System.out.println();
		
		label: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					continue label;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();
		
		System.out.println("<< while문으로 변환 >>");
		int c1 = 0;
		label: while (c1 < 5) {
			int c2 = 0;
			while (c2 < 5) {
				if (c2 == 2) {
					c1++;
					continue label;
				}
				System.out.println(c1 + ", " + c2);
				c2++;
			}
		}
	}
}
