package sec01_array.Ex01;

public class ArrayDefinition {
	
	public static void main(String[] args) {
		// #1. 배열의 선언 방법 1
		int[] array1 = new int[3];
		int[] array2;
		array2 = new int[3];
		
		// #2. 배열의 선언 방법 2
		int array3[] = new int[3];
		int array4[];
		array4 = new int[3];
		
		// #3. 다양한 배열 선언 (기본자료형 배열, 참조자료형 배열) => 배열값들의 타입이 기본자료형이라는 것. 절대 배열이 기본자료형이라는 것이 아님. 배열은 참조자료형!
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5];
		double[] array7 = new double[7];
		
		String[] array8 = new String[9];
	}
}
