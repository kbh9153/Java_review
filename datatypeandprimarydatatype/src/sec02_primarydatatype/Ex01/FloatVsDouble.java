package sec02_primarydatatype.Ex01;

public class FloatVsDouble {
	public static void main(String[] args) {
		// #1 float의 정밀도 : 대략 소수점 7번째 자리까지 출력 가능(정확한 자리수는 아님)
		float f1 = 1.0000001f;
		System.out.println(f1);
		
		float f2 = 1.00000001f;
		System.out.println(f2);
		
		// #2 double의 정밀도 : 대략 소수점 15번째 자리까지 출력 가능(정확한 자리수는 아님)
		double d1 = 1.000000000000001;
		System.out.println(d1);
		
		double d2 = 1.0000000000000001;
		System.out.println(d2);
		
	}
}
