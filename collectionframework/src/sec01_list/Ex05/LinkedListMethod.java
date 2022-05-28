package sec01_list.Ex05;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// linkedList는 자동으로 동기화되어 멀티 스레드에 적합
public class LinkedListMethod {

	public static void main(String[] args) {
		List<Integer> linkedList1 = new LinkedList<Integer>();
		
		// #1. add (E element)
		linkedList1.add(3);
		linkedList1.add(4);
		linkedList1.add(5);
		System.out.println(linkedList1.toString());
		System.out.println(linkedList1);	// toString() 제외하여도 출력값 같음. 제외할시 println이 toString()을 호출해줌
		
		// #2. add (int index, E element)
		linkedList1.add(1, 6);	// 1번 자리에 6을 추가. 기존 값들은 우측으로 밀려남
		System.out.println(linkedList1);	// [3, 6, 4, 5]
		
		// #3. addAll (또 다른 List 객체)
		List<Integer> linkedList2 = new LinkedList<>();
		linkedList2.add(1);
		linkedList2.add(2);
		linkedList2.addAll(linkedList1);	// 마지막 우측에 linkedList1의 값들을 추가
		System.out.println(linkedList2);	// [1, 2, 3, 6, 4, 5]
		
		// #4. addALL (int index, E element)
		List<Integer> linkedList3 = new LinkedList<>();
		linkedList3.add(1);
		linkedList3.add(2);	
		linkedList3.addAll(1, linkedList3);	// 1번 자리에 linkedList3 본인의 값들을 추가. 기존 값들은 우측으로 밀려남
		System.out.println(linkedList3);	// [1, 1, 2, 2]
		
		// #5. set (int index, E element)
		linkedList3.set(2, 7);	// linkedList3의 2번 자리의 값을 7로 변경
		linkedList3.set(3, 6);	// linkedList3의 3번 자리의 값을 6으로 변경
//		linkedList3.set(4, 9);	// IndexOutOfBoundsException 발생. List의 범위를 벗어난 경우의 에러
		System.out.println(linkedList3);	// [1, 1, 7, 6]
		
		// #6. remove (int index)
		linkedList3.remove(1);	// 1번 자리의 값을 삭제. 자리 수를 지우는 것. 1 이라는 값을 삭제가 아님
		System.out.println(linkedList3);	// [1, 7, 6]
		
		// #7. remove (Object o)
		linkedList3.remove(new Integer(7));	// linkedList3 값중 7이라는 값을 삭제. List의 특정값을 삭제할 떄는 객체를 통해 삭제해야함
		System.out.println(linkedList3);	// [1, 6]
		
		// #8. clear()
		linkedList3.clear();	// 모든 값 삭제
		System.out.println(linkedList3);
		
		// #9. isEmpty() : 값들이 없는지 true, false
		System.out.println(linkedList3.isEmpty());	// true
		
		// #10. size() : 값의 개수
		System.out.println(linkedList3.size());	// 0
		linkedList3.add(1);
		linkedList3.add(2);
		linkedList3.add(3);
		System.out.println(linkedList3);	// [1, 2, 3]
		System.out.println(linkedList3.size());	// 3
		
		// #11. get(int index) : index로만 값을 가져올 수 있음
		System.out.println("0번째 데이터 : " + linkedList3.get(0));		// 1
		System.out.println("1번째 데이터 : " + linkedList3.get(1));		// 2
		System.out.println("2번째 데이터 : " + linkedList3.get(2));		// 3
		
		System.out.println();
		
		for (int i = 0; i < linkedList3.size(); i++) {
			System.out.println(i + "번째 데이터 : " + linkedList3.get(i));
		}
		
		// #12. toArray() List -> Array	: Object 타입으로 반환
		Object[] obj = linkedList3.toArray();
		System.out.println(Arrays.toString(obj));	// [1, 2, 3]
		
		// #13-1. Arrays(T[] t) -> T[] 타입 배열 출력 (Object 타입을 다른 타입으로 매번 변환하는 번거로움을 해결)
		Integer[] integer1 = linkedList3.toArray(new Integer[5]);	// linkedList3은 [1, 2, 3] 3개의 값을 가졌지만 5개의 크기를 만듬
		System.out.println(Arrays.toString(integer1));	// [1, 2, 3, null, null] -> 5개 크기 중 3개의 값이 들어오고 나머지 자리는 null로 채움
		
		// 13-2. Arrays(T[] t) -> T[] 타입 배열 출력 
		Integer[] integer2 = linkedList3.toArray(new Integer[2]);	// List의 값 개수보다 배열의 방을 적게 설정하면 부족한 방 크기만큼 컴파일러가 자동으로 생성
		// 컴파일러가 자동으로 부족한 방 크기만큼 생성하기 때문에 [0]으로 설정하는 경우가 많음
		System.out.println(Arrays.toString(integer2));	// [1, 2, 3] 
	}
}
