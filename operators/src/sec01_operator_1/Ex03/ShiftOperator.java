package sec01_operator_1.Ex03;

public class ShiftOperator {
	public static void main(String[] args) {
		// #1. �������Ʈ(��ȣ��ȭ�� ���� *2, /2 ȿ��)
		// @ << : Left shift
		System.out.println(3 << 1);	// 6
		System.out.println(-3 << 1);	// -6
		System.out.println(3 << 2);	// 12
		System.out.println(-3 << 2);	// -12
		System.out.println();
		
		// @ >> : Right shift
		System.out.println(5 >> 1);	// 2
		System.out.println(-5 >> 1);	// -3
		System.out.println(5 >> 2);	// 1
		System.out.println(-5 >> 2);	// -2
		
		// #2. ������Ʈ(>>>)
		System.out.println(3 >>> 1);	// 1
		System.out.println(-3 >>> 31);	// 1
	}
}
