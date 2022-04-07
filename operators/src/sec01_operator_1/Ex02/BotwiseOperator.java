package sec01_operator_1.Ex02;

public class BotwiseOperator {
	public static void main(String[] args) {
		// #0. �ڹ��ڵ�� ���� ��ȯ
		int data = 13;
		System.out.println(Integer.toBinaryString(data));	// 1101. 2�������� ��ȯ
		System.out.println(Integer.toOctalString(data));	// 15. 8�������� ��ȯ
		System.out.println(Integer.toHexString(data));	// (0)d. 16�������� ��ȯ
		
		System.out.println();
		
		System.out.println(Integer.parseInt("1101", 2));	// 13. 1101, 2 : 2������ 1101�� 10�������� ��ȯ
		System.out.println(Integer.parseInt("15", 8));	// 13. 15, 8 : 8������ 15�� 10�������� ��ȯ
		System.out.println(Integer.parseInt("0d", 16));	// 13. 0d, 16 : 16������ 0d�� 10�������� ��ȯ
		System.out.println();
		
		// #1. �پ��� ���� ǥ��
		System.out.println(13);	// 13
		System.out.println(0b1101);	// 13
		System.out.println(015);	// 13
		System.out.println(0x0d);	// 13
		System.out.println();
		
		// #2. ��Ʈ������
		// @AND ��Ʈ������
		System.out.println(3 & 10);	// 2
		System.out.println(0b0011 & 0b1010);	// 2
		System.out.println(0x03 & 0x0a);	// 2
		System.out.println();
		
		// @OR ��Ʈ������
		System.out.println(3 | 10);	// 11
		System.out.println(0b0011 | 0b1010);	// 11
		System.out.println(0x03 | 0x0a);	// 11
		System.out.println();
		
		// @XOR ��Ʈ������
		System.out.println(3 ^ 10);		// 9
		System.out.println(0b0011 ^ 0b1010);	// 9
		System.out.println(0x03 ^ 0x0a);	// 9
		System.out.println();
		
		// @NOT ��Ʈ������
		System.out.println(~3);	// -4
		System.out.println(~0b0011);	// -4
		System.out.println(~0x03);	// -4
	}
}
