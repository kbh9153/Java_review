package sec01_list.Ex06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		// #1. 데이터 추가시간 비교
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		long startTime = 0;
		long endTime = 0;
		
		// #1-1. ArrayList 데이터 추가 시간
		startTime = System.nanoTime();	// 처리 시작 시간
		for (int i = 0; i < 100000; i++) {	// 처리
			aList.add(0, i);
		}
		endTime = System.nanoTime();	// 처리 종료 시간
		
		long arrayListRuntime = endTime - startTime; 
		
		System.out.println("ArrayList 데이터 추가시간 = " + arrayListRuntime + "ns");		// 처리 종료 시간 - 처리 시작 시간 = 작업시간
		
		// #1-2. LinkedList 데이터 추가 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.add(0, i);
		}
		endTime = System.nanoTime();
		
		long linkedListRunTime = endTime - startTime;
		
		System.out.println("LinkedList 데이터 추가시간 = " + linkedListRunTime + "ns");
		
		System.out.println("데이터 추가는 LinkedList가 ArrayList보다 [" + ((double)arrayListRuntime / (double)linkedListRunTime) + "배] 빠름");
		
		System.out.println();
		try {Thread.sleep(300);} catch (InterruptedException e) {}
		
		// #2-1. ArrayList 데이터 검색 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		
		arrayListRuntime = endTime - startTime;
		
		System.out.println("ArrayList 데이터 검색시간 = " + arrayListRuntime + "ns");
		
		// #2-2. LinkedList 데이터 검색 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		
		linkedListRunTime = endTime - startTime;
		
		System.out.println("LinkedList 데이터 검색시간 = " + linkedListRunTime + "ns");
		
		System.out.println("데이터 검색는 ArrayList가 LinkedList보다 [" + ((double)linkedListRunTime / (double)arrayListRuntime) + "배] 빠름");
		
		System.out.println();
		try {Thread.sleep(300);} catch (InterruptedException e) {}
		
		// #3-1. ArrayList 데이터 제거 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.remove(0);
		}
		endTime = System.nanoTime();
		
		arrayListRuntime = endTime - startTime;
		
		System.out.println("ArrayList 데이터 제거시간 = " + arrayListRuntime + "ns");
		
		// #3-2. LinkedList 데이터 제거 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.remove(0);
		}
		endTime = System.nanoTime();
		
		linkedListRunTime = endTime - startTime;
		
		System.out.println("LinkedList 데이터 제거시간 = " + linkedListRunTime + "ns");
		
		System.out.println("데이터 제거는 LinkedList가 ArrayList보다 [" + ((double)arrayListRuntime / (double)linkedListRunTime) + "배] 빠름");
		
	}
}
