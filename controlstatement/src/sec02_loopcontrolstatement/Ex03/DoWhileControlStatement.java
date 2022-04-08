package sec02_loopcontrolstatement.Ex03;

public class DoWhileControlStatement {

	public static void main(String[] args) {
		// #1. 반복회수가 0번인 경우 do-while vs while 문 비교
		int a;
		a = 0;
		while (a < 0) {
			System.out.print(a + " ");
			a++;
		}	// 실행회수 0번
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 0);	// 실행회수 1번 => 0 출력
		
		System.out.println();
		
		// #1. 반복회수가 1번 이상 경우 do-while vs while 문 비교
		a = 0;
		while (a < 1) {
			System.out.print(a + " ");
			a++;
		}	// 실행회수 1번
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 1);	// 실행회수 1번
		System.out.println();
		
		// #1. 반복회수가 10번 이상 경우 do-while vs while 문 비교
		a = 0;
		while (a < 10) {
			System.out.print(a + " ");
			a++;
		}	// 0 ~ 9, 실행회수 10번
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 10);	// 0 ~ 9, 실행회수 10번
	}
}
