package sec01_operator_1.Ex06;

public class AssignmentOperator {
	public static void main(String[] args) {
		// #1. ���Կ����ڿ� ��� ǥ��
		// @���Կ�����
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);	// 6
		
		System.out.println();
		
		// @���ǥ��
		int value2;
		value2 = 5;
		System.out.println(value2 += 2);	// 7. value2 = value2 + 2
		
		value2 = 5;
		System.out.println(value2 -= 2);	// 3. value2 = value2 - 2
		
		value2 = 5;
		System.out.println(value2 *= 2);	// 10. value2 = value2 * 2
		
		value2 = 5;
		System.out.println(value2 /= 2);	// 2. value2 = value2 / 2
		
		value2 = 5;
		System.out.println(value2 %= 2);	// 1. value2 = value2 % 2
		
		value2 = 5;
		System.out.println(value2 |= 2);	// 7. value2 = value2 | 2
		
		value2 = 5;
		System.out.println(value2 <<= 2);	// 20. value2 = value2 << 2
		
		value2 = 5;
		System.out.println(value2 >>= 2);	// 1. value2 = value2 >> 2
		
		value2 = 5;
		System.out.println(value2 >>>= 2);	// 1. value2 = value2 >>> 2
	}
}
