package sec01_operator_1.Ex04;

public class RalationOperator {
	public static void main(String[] args) {
		// #1. ũ��� (<, >, <=, >=) : true, false
		System.out.println(5 < 2); 	// false
		System.out.println(5 > 2);	// true
		System.out.println(5 < 5);	// false
		System.out.println(5 <= 5);	// true
		System.out.println(5 >= 5);	// true
		System.out.println();
		
		// #2. ��� (==, !=)
		int a = 5;
		System.out.println(a == 2);	// false
		System.out.println(5 == 2);	// false
		System.out.println(5 != 2);	// true
		System.out.println(5 == 5);	// true
		System.out.println(5 != 5);	// false
		System.out.println();
		
		// @ �����ڷ��� ���
		String str1 = new String("�ȳ�");
		String str2 = new String("�ȳ�");
		System.out.println(str1 == str2);	// false
		
	}
}
