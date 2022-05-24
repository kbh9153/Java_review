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
		System.out.println(aList1);	// toString() �����Ͽ��� ��°� ����. �����ҽ� println�� toString()�� ȣ������
		
		// #2. add (int index, E element)
		aList1.add(1, 6);	// 1�� �ڸ��� 6�� �߰�. ���� ������ �������� �з���
		System.out.println(aList1);	// [3, 6, 4, 5]
		
		// #3. addAll (�� �ٸ� List ��ü)
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);	// ������ ������ aList1�� ������ �߰�
		System.out.println(aList2);	// [1, 2, 3, 6, 4, 5]
		
		// #4. addALL (int index, E element)
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);	
		aList3.addAll(1, aList3);	// 1�� �ڸ��� aList3 ������ ������ �߰�. ���� ������ �������� �з���
		System.out.println(aList3);	// [1, 1, 2, 2]
		
		// #5. set (int index, E element)
		aList3.set(2, 7);	// aList3�� 2�� �ڸ��� ���� 7�� ����
		aList3.set(3, 6);	// aList3�� 3�� �ڸ��� ���� 6���� ����
//		aList3.set(4, 9);	// IndexOutOfBoundsException �߻�. List�� ������ ��� ����� ����
		System.out.println(aList3);	// [1, 1, 7, 6]
		
		// #6. remove (int index)
		aList3.remove(1);	// 1�� �ڸ��� ���� ����. �ڸ� ���� ����� ��. 1 �̶�� ���� ������ �ƴ�
		System.out.println(aList3);	// [1, 7, 6]
		
		// #7. remove (Object o)
		aList3.remove(new Integer(7));	// aList3 ���� 7�̶�� ���� ����. List�� Ư������ ������ ���� ��ü�� ���� �����ؾ���
		System.out.println(aList3);	// [1, 6]
		
		// #8. clear()
		aList3.clear();	// ��� �� ����
		System.out.println(aList3);
		
		// #9. isEmpty() : ������ ������ true, false
		System.out.println(aList3.isEmpty());	// true
		
		// #10. size() : ���� ����
		System.out.println(aList3.size());	// 0
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println(aList3);	// [1, 2, 3]
		System.out.println(aList3.size());	// 3
		
		// #11. get(int index) : index�θ� ���� ������ �� ����
		System.out.println("0��° ������ : " + aList3.get(0));		// 1
		System.out.println("1��° ������ : " + aList3.get(1));		// 2
		System.out.println("2��° ������ : " + aList3.get(2));		// 3
		
		System.out.println();
		
		for (int i = 0; i < aList3.size(); i++) {
			System.out.println(i + "��° ������ : " + aList3.get(i));
		}
		
		// #12. toArray() List -> Array	: Object Ÿ������ ��ȯ
		Object[] obj = aList3.toArray();
		System.out.println(Arrays.toString(obj));	// [1, 2, 3]
		
		// #13-1. Arrays(T[] t) -> T[] Ÿ�� �迭 ��� (Object Ÿ���� �ٸ� Ÿ������ �Ź� ��ȯ�ϴ� ���ŷο��� �ذ�)
		Integer[] integer1 = aList3.toArray(new Integer[5]);	// aList3�� [1, 2, 3] 3���� ���� �������� 5���� ũ�⸦ ����
		System.out.println(Arrays.toString(integer1));	// [1, 2, 3, null, null] -> 5�� ũ�� �� 3���� ���� ������ ������ �ڸ��� null�� ä��
		
		// 13-2. Arrays(T[] t) -> T[] Ÿ�� �迭 ��� 
		Integer[] integer2 = aList3.toArray(new Integer[2]);	// List�� �� �������� �迭�� ���� ���� �����ϸ� ������ �� ũ�⸸ŭ �����Ϸ��� �ڵ����� ����
		// �����Ϸ��� �ڵ����� ������ �� ũ�⸸ŭ �����ϱ� ������ [0]���� �����ϴ� ��찡 ����
		System.out.println(Arrays.toString(integer2));	// [1, 2, 3] 
	}
}
