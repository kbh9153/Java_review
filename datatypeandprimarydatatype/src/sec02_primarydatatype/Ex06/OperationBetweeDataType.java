package sec02_primarydatatype.Ex06;

public class OperationBetweeDataType {

	public static void main(String[] args) {
		// #1. 같은 자료형간의 연산
		int value1 = 3 + 5;
		int value2 = 8 / 5;	// int / int = int
		float value3 = 3.0F + 5.0F;
		double value4 = 8.0 / 5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		// byte value5 = data1 + data2;	// byte = int + int => 불가능
		int value5 = data1 + data2;
		// byte value5 = (byte)(data1 + data2);
		
		System.out.println(value1);
		System.out.println(value2);	// 1
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		// #2. 다른 자료형간의 연산
		// int value6 = 5 + 3.5;
		double value6 = 5 + 3.5;
		int value7 = 5 + (int)3.5;
		double value8 = 5 / 2.0;
		byte data3 = 3;
		short data4 = 5;
		int value9 = data3 + data4;	// int보다 작은 자료형(byte, short)끼리 더하면 int 결과 자료형이 나옴
		double value10 = data3 + data4;
		
		System.out.println(value6);	// 8.5
		System.out.println(value7);	// 8
		System.out.println(value8);	// 2.5
		System.out.println(value9);	// 8
		System.out.println(value10);	// 8.0
		
		
		
	}

}
