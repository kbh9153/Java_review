package sec02_set.Ex01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {

	public static void main(String[] args) {
		Set<String> hSet1 = new HashSet<>();
		// #1. add(E element)
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("가");		// Set은 인덱스 정보가 없어 중복값을 허용하지 않음
		System.out.println(hSet1.toString());	// [가, 나]. toString() 생략 가능
		
		// #2. allAll(다른 Set 객체)
		Set<String> hSet2 = new HashSet<>();
		hSet2.add("나");
		hSet2.add("다");
		hSet2.addAll(hSet1);	// hSet1의 값과 중복되지 않는 값만 추가
		System.out.println(hSet2);	// [가, 다, 나]. HashSet은 입력 순서와 출력 순서가 다를 수 있음
		
		// #3. remove(Object o)
		hSet2.remove("나");		// [가, 다]
		
		// #4. clear()
		hSet2.clear();
		System.out.println(hSet2);
		
		// #5. isEmpty()
		System.out.println(hSet2.isEmpty());	// true
		
		// #6. contains(Object o) : 특정 데이터가 있는지 확인
		Set<String> hSet3 = new HashSet<>();
		hSet3.add("가");
		hSet3.add("나");
		hSet3.add("다");
		System.out.println(hSet3.contains("나"));	// true
		System.out.println(hSet3.contains("라"));	// false
		
		// #7. size()
		System.out.println(hSet3.size());	// 3
		
		// #8. iterator() : iterator 객체 내부에 데이터를 하나씩 읽을 수 있는 기능이 포함
		Iterator<String> iterator =  hSet3.iterator();
		
		while(iterator.hasNext()) {	// hasNext() : 다음에 데이터 존재 유무. 총 3바퀴
			System.out.println(iterator.next());	// next() : 다음 데이터로 이동
		}
		
		// #9. toArray()
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray));	// [가, 다, 나]
		
		// #10-1. toArray[T[] t]
		String[] strArray1 = hSet3.toArray(new String[0]);	// 배열의 방을 실제 데이터 개수보다 작게 설정시 자동으로 데이터 개수에 맞춰서 방이 설정
		System.out.println(Arrays.toString(strArray1));	// [가, 다, 나]
		
		// #10-2. toArray[T[] t]
		String[] strArray2 = hSet3.toArray(new String[5]);	// 배열의 방을 실제 데이터 개수보다 크게 설정시 데이터 개수보다 초과된 개수만큼 null 값으로 초기화
		System.out.println(Arrays.toString(strArray2));	// [가, 다, 나, null, null]
	}
}
