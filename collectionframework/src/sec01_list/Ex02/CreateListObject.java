package sec01_list.Ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	
	public static void main(String[] args) {
		// #��� 1. List ���� Ŭ������ �����ڸ� ����Ͽ� ��ü ����
		List<Integer> aList1 = new ArrayList<>();		// () : capacity�� 10�� �⺻
		List<Integer> aList2 = new ArrayList<>(30);		// (30) : capacity. ����뷮 ����. size()�� ������ ������ �ƴ�

		List<Integer> aList3 = new Vector<>();
		List<Integer> aList4 = new Vector<>();
		
		List<Integer> aList5 = new LinkedList<>();
//		List<Integer> aList6 = new LinkedList<>(30);		// LinkedList�� ����뷮�� �����ϴ� ������ ���� -> capacity
		
		// #��� 2. Arrays Ŭ������ ���� �޼ҵ� Ȱ�� (��, �� ��� �������� ũ�⸦ �ٲ� �� ����(�߰�, ����))
			// Arrays.asList�� �������� ������ �迭�� ����� List�� ���δ� ������. �迭�� ������ ������ ���� ���� �Ұ�
		List<Integer> aList7 = Arrays.asList(1, 2, 3, 4);
		List<String> aList8 = Arrays.asList("�ȳ�", "hello");
		List<String> aList9 = Arrays.<String>asList("�ȳ�", "hello");	// ������ ���׸� Ÿ���� ��� ����
		aList7.set(1, 7);	// Arrays.asList�� ������ ����
		aList8.set(0, "����");
		
//		aList7.add(5);	// Arrays.asList�� �߰�, ���� �Ұ�
//		aList8.remove(0);	// Arrays.asList�� �߰�, ���� �Ұ�
		
		System.out.println(aList7);	
		System.out.println(aList8);
	}
}
