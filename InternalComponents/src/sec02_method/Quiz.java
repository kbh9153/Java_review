package sec02_method;

class A {
	void averageScore(int... is) {
		int sum = 0;
		double average = 0.0;
		for (int i = 0; i < is.length; i++) {
			sum += is[i];
			average = ((double)sum / is.length);
		}
		System.out.println(average);
		
//		for (int a : is) {
//			sum += a;
//		}
//		System.out.println((double)sum / is.length);
	}
}

public class Quiz {

	public static void main(String[] args) {
		// #Q5
		A a = new A();
		
		a.averageScore(1);
		a.averageScore(1, 2);
		a.averageScore(1, 2, 3);
		a.averageScore(1, 2, 3, 4);
	}
}
