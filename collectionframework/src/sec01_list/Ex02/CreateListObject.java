package sec01_list.Ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	
	public static void main(String[] args) {
		// #방법 1. List 구현 클래스의 생성자를 사용하여 객체 생성
		List<Integer> aList1 = new ArrayList<>();		// () : capacity는 10이 기본
		List<Integer> aList2 = new ArrayList<>(30);		// (30) : capacity. 저장용량 설정. size()의 데이터 개수가 아님

		List<Integer> aList3 = new Vector<>();
		List<Integer> aList4 = new Vector<>();
		
		List<Integer> aList5 = new LinkedList<>();
//		List<Integer> aList6 = new LinkedList<>(30);		// LinkedList는 저장용량을 지정하는 생성자 없음 -> capacity
		
		// #방법 2. Arrays 클래스의 정적 메소드 활용 (단, 이 경우 데이터의 크기를 바꿀 수 없음(추가, 삭제))
			// Arrays.asList는 생성자의 값으로 배열을 만들어 List로 감싸는 형태임. 배열을 가지기 때문에 개수 변경 불가
		List<Integer> aList7 = Arrays.asList(1, 2, 3, 4);
		List<String> aList8 = Arrays.asList("안녕", "hello");
		List<String> aList9 = Arrays.<String>asList("안녕", "hello");	// 생성자 제네릭 타입을 명시 가능
		aList7.set(1, 7);	// Arrays.asList도 변경은 가능
		aList8.set(0, "감사");
		
//		aList7.add(5);	// Arrays.asList는 추가, 삭제 불가
//		aList8.remove(0);	// Arrays.asList는 추가, 삭제 불가
		
		System.out.println(aList7);	
		System.out.println(aList8);
	}
}
