package sec01_list.Ex06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		// #1. ������ �߰��ð� ��
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		long startTime = 0;
		long endTime = 0;
		
		// #1-1. ArrayList ������ �߰� �ð�
		startTime = System.nanoTime();	// ó�� ���� �ð�
		for (int i = 0; i < 100000; i++) {	// ó��
			aList.add(0, i);
		}
		endTime = System.nanoTime();	// ó�� ���� �ð�
		
		long arrayListRuntime = endTime - startTime; 
		
		System.out.println("ArrayList ������ �߰��ð� = " + arrayListRuntime + "ns");		// ó�� ���� �ð� - ó�� ���� �ð� = �۾��ð�
		
		// #1-2. LinkedList ������ �߰� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.add(0, i);
		}
		endTime = System.nanoTime();
		
		long linkedListRunTime = endTime - startTime;
		
		System.out.println("LinkedList ������ �߰��ð� = " + linkedListRunTime + "ns");
		
		System.out.println("������ �߰��� LinkedList�� ArrayList���� [" + ((double)arrayListRuntime / (double)linkedListRunTime) + "��] ����");
		
		System.out.println();
		try {Thread.sleep(300);} catch (InterruptedException e) {}
		
		// #2-1. ArrayList ������ �˻� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		
		arrayListRuntime = endTime - startTime;
		
		System.out.println("ArrayList ������ �˻��ð� = " + arrayListRuntime + "ns");
		
		// #2-2. LinkedList ������ �˻� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		
		linkedListRunTime = endTime - startTime;
		
		System.out.println("LinkedList ������ �˻��ð� = " + linkedListRunTime + "ns");
		
		System.out.println("������ �˻��� ArrayList�� LinkedList���� [" + ((double)linkedListRunTime / (double)arrayListRuntime) + "��] ����");
		
		System.out.println();
		try {Thread.sleep(300);} catch (InterruptedException e) {}
		
		// #3-1. ArrayList ������ ���� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.remove(0);
		}
		endTime = System.nanoTime();
		
		arrayListRuntime = endTime - startTime;
		
		System.out.println("ArrayList ������ ���Žð� = " + arrayListRuntime + "ns");
		
		// #3-2. LinkedList ������ ���� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.remove(0);
		}
		endTime = System.nanoTime();
		
		linkedListRunTime = endTime - startTime;
		
		System.out.println("LinkedList ������ ���Žð� = " + linkedListRunTime + "ns");
		
		System.out.println("������ ���Ŵ� LinkedList�� ArrayList���� [" + ((double)arrayListRuntime / (double)linkedListRunTime) + "��] ����");
		
	}
}
