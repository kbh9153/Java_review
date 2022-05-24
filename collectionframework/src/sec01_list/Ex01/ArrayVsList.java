package sec01_list.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsList {

	public static void main(String[] args) {
		// #1.
		String[] array = new String[] {"가", "나", "다", "라", "마", "바", "사"};
		
		array[2] = null;
		array[5] = null;
		
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		
		System.out.println(array.length);
		System.out.println();
		
		// #2.
		List<String> alist = new ArrayList<>();
		
		System.out.println(alist.size());	// 데이터의 개수 구하기
		
		alist.add("가");
		alist.add("나");
		alist.add("다");
		alist.add("라");
		alist.add("마");
		alist.add("바");
		alist.add("사");
		System.out.println(alist.size());	// 데이터의 개수 구하기
		
		alist.remove("다");
		alist.remove("바");
		System.out.println(alist.size());	// 데이터의 개수 구하기
		System.out.println(alist);
	}
}
