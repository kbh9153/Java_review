package sec03_list.Ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		List<Integer> aList1 = new ArrayList<Integer>();
		
		// #1. add (E element)
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString());
		System.out.println(aList1);	// toString() 제외하여도 출력값 같음. 제외할시 println이 toString()을 호출해줌
		
		// #2. add (int index, E element)
		aList1.add(1, 6);	// 1번 자리에 6을 추가. 기존 값들은 우측으로 밀려남
		System.out.println(aList1);	// [3, 6, 4, 5]
		
		// #3. addAll (또 다른 List 객체)
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);	// 마지막 우측에 aList1의 값들을 추가
		System.out.println(aList2);	// [1, 2, 3, 6, 4, 5]
		
		// #4. addALL (int index, E element)
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);	
		aList3.addAll(1, aList3);	// 1번 자리에 aList3 본인의 값들을 추가. 기존 값들은 우측으로 밀려남
		System.out.println(aList3);	// [1, 1, 2, 2]
		
		// #5. set (int index, E element)
		aList3.set(2, 7);	// aList3의 2번 자리의 값을 7로 변경
		aList3.set(3, 6);	// aList3의 3번 자리의 값을 6으로 변경
//		aList3.set(4, 9);	// IndexOutOfBoundsException 발생. List의 범위를 벗어난 경우의 에러
		System.out.println(aList3);	// [1, 1, 7, 6]
		
		// #6. remove (int index)
		aList3.remove(1);	// 1번 자리의 값을 삭제. 자리 수를 지우는 것. 1 이라는 값을 삭제가 아님
		System.out.println(aList3);	// [1, 7, 6]
		
		// #7. remove (Object o)
		aList3.remove(new Integer(7));	// aList3 값중 7이라는 값을 삭제. List의 특정값을 삭제할 떄는 객체를 통해 삭제해야함
		System.out.println(aList3);	// [1, 6]
		
		// #8. clear()
		aList3.clear();	// 모든 값 삭제
		System.out.println(aList3);
		
		// #9. isEmpty() : 값들이 없는지 true, false
		System.out.println(aList3.isEmpty());	// true
		
		// #10. size() : 값의 개수
		System.out.println(aList3.size());	// 0
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println(aList3);	// [1, 2, 3]
		System.out.println(aList3.size());	// 3
		
		// #11. get(int index) : index로만 값을 가져올 수 있음
		System.out.println("0번째 데이터 : " + aList3.get(0));		// 1
		System.out.println("1번째 데이터 : " + aList3.get(1));		// 2
		System.out.println("2번째 데이터 : " + aList3.get(2));		// 3
		
		System.out.println();
		
		for (int i = 0; i < aList3.size(); i++) {
			System.out.println(i + "번째 데이터 : " + aList3.get(i));
		}
		
		// #12. toArray() List -> Array	: Object 타입으로 반환
		Object[] obj = aList3.toArray();
		System.out.println(Arrays.toString(obj));	// [1, 2, 3]
		
		// #13-1. Arrays(T[] t) -> T[] 타입 배열 출력 (Object 타입을 다른 타입으로 매번 변환하는 번거로움을 해결)
		Integer[] integer1 = aList3.toArray(new Integer[5]);	// aList3은 [1, 2, 3] 3개의 값을 가졌지만 5개의 크기를 만듬
		System.out.println(Arrays.toString(integer1));	// [1, 2, 3, null, null] -> 5개 크기 중 3개의 값이 들어오고 나머지 자리는 null로 채움
		
		// 13-2. Arrays(T[] t) -> T[] 타입 배열 출력 
		Integer[] integer2 = aList3.toArray(new Integer[2]);	// List의 값 개수보다 배열의 방을 적게 설정하면 부족한 방 크기만큼 컴파일러가 자동으로 생성
		// 컴파일러가 자동으로 부족한 방 크기만큼 생성하기 때문에 [0]으로 설정하는 경우가 많음
		System.out.println(Arrays.toString(integer2));	// [1, 2, 3] 
	}
}
