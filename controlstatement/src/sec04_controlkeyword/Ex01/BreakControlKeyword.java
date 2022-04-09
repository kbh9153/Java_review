package sec04_controlkeyword.Ex01;

public class BreakControlKeyword {

	public static void main(String[] args) {
		// #1. 단일 loop break 탈출
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break;
		}	// 0. 한번만 출력하고 탈출
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i + " ");
		}	// 0, 1, 2, 3, 4
		System.out.println();
		
		System.out.println("<< while문 변환 >>");
		int a1 = 0;
		while (a1 < 10) {
			if (a1 == 5) {
				break;
			}
			System.out.print(a1 + " ");
			a1++;
		}
		
		System.out.println();
		System.out.println();
		
		// #2. 다중(이중) loop break 탈출
		// @case1. 하나의 반복문만 탈출하는 경우
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();
		
		System.out.println("<< while문 변환 >>");
		int a2 = 0;
		while (a2 < 5) {
			int a3 = 0;
			while (a3 < 5) {
				if (a3 == 2) {
					break;
				}
				System.out.println(a2 + ", " + a3);
				a3++;
			}
			a2++;
		}
		System.out.println();
		
		// @case2. 다중 반복문을 한번에 탈출하는 경우 (break LABEL)
		out: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break out;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();
		
		System.out.println("<< while문 변환 >>");
		int b1 = 0;
		out: while (b1 < 5) {
			int b2 = 0;
			while (b2 < 5) {
				if (b2 == 2) {
					break out;
				}
				System.out.println(b1 + ", " + b2);
				b2++;
			}
			b1++;
		}
		System.out.println();
		
		// @case3. 다중 반복문을 한번에 탈출하는 경우 (변수값으로 조정)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					i = 99;
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();
		
		System.out.println("<< while문 변환 >>");
		int c1 = 0;
		while (c1 < 5) {
			int c2 = 0;
			while (c2 < 5) {
				if (c2 == 2) {
					c1 = 50;
					break;
				}
				System.out.println(c1 + ", " + c2);
				c2++;
			}
			c1++;
		}
	}
}
