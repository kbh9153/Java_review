package sec01_basicsyntax.Ex03;

public class ConsoleOutput {
	public static void main(String[] args) {
		// #1. System.out.println(...);
		System.out.println("화면출력");
		System.out.println("화면" + "출력");	// 화면출력
		System.out.println(3.8);	// 3.8
		System.out.println(3 + 5);	// 8
		System.out.println("화면" + 3);
		System.out.println("화면" + 3 + 5);
		System.out.println(3 + 5 + "화면");
		System.out.println();
		
		int a = 3;
		String b = "화면";
		System.out.println(a);	// 3
		System.out.println(b);	// 화면
		System.out.println(b + "출력");	// 화면출력
		System.out.println(a + b + "출력");	// 화면출력
		System.out.println();
		
		// #2. System.out.print(...);
		System.out.print("화면");
		System.out.print("출력");
		System.out.print("3");
		System.out.print("\n");	// \n의 의미는 개행(새로운 행으로 바꿈)해라는 의미
		System.out.print("\n");	// \n의 의미는 개행(새로운 행으로 바꿈)해라는 의미
		
		// #3. System.out.printf(...);
		System.out.printf("%d\n", 30);	// 30 => %d : 10진수(decimal)
		System.out.printf("%o\n", 30);	// 36 => %o : 8진수(octal)
		System.out.printf("%x\n", 30);	// 1e => %x : 16진수(hexadecimal)
		
		System.out.printf("%s\n", "출력");	// 출력 => %s : 문자열(String)
		System.out.printf("%f\n", 5.8);		// 5.800000 => %f : 실수
		System.out.printf("%4.2f\n", 5.8);		// 5.80 => %전체자리수.소수점자리수f\ : 전체자리수는 소수점까지 포함해서 지정
		System.out.printf("%d과 %4.2f\n", 3, 5.3);
	}
}
