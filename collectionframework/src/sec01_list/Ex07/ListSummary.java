package sec01_list.Ex07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {
	
	public static void main(String[] args) {
		// #1. ArrayList
		List<String> arrayList = new ArrayList<>();
		arrayList.add("다");
		arrayList.add("가");
		arrayList.add("라");
		arrayList.add("나");
		System.out.println(arrayList);	// [다, 가, 라, 나]
		
		// #2. Vector
		List<String> vector = new Vector<>();
		vector.add("다");
		vector.add("가");
		vector.add("라");
		vector.add("나");
		System.out.println(vector);	// [다, 가, 라, 나]
		
		// #3. LinkedList
		List<String> linkedList = new LinkedList<>();
		linkedList.add("다");
		linkedList.add("가");
		linkedList.add("라");
		linkedList.add("나");
		System.out.println(linkedList);	// [다, 가, 라, 나]
	}
}
