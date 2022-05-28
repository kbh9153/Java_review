package sec01_list.Ex05;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// linkedList�� �ڵ����� ����ȭ�Ǿ� ��Ƽ �����忡 ����
public class LinkedListMethod {

	public static void main(String[] args) {
		List<Integer> linkedList1 = new LinkedList<Integer>();
		
		// #1. add (E element)
		linkedList1.add(3);
		linkedList1.add(4);
		linkedList1.add(5);
		System.out.println(linkedList1.toString());
		System.out.println(linkedList1);	// toString() �����Ͽ��� ��°� ����. �����ҽ� println�� toString()�� ȣ������
		
		// #2. add (int index, E element)
		linkedList1.add(1, 6);	// 1�� �ڸ��� 6�� �߰�. ���� ������ �������� �з���
		System.out.println(linkedList1);	// [3, 6, 4, 5]
		
		// #3. addAll (�� �ٸ� List ��ü)
		List<Integer> linkedList2 = new LinkedList<>();
		linkedList2.add(1);
		linkedList2.add(2);
		linkedList2.addAll(linkedList1);	// ������ ������ linkedList1�� ������ �߰�
		System.out.println(linkedList2);	// [1, 2, 3, 6, 4, 5]
		
		// #4. addALL (int index, E element)
		List<Integer> linkedList3 = new LinkedList<>();
		linkedList3.add(1);
		linkedList3.add(2);	
		linkedList3.addAll(1, linkedList3);	// 1�� �ڸ��� linkedList3 ������ ������ �߰�. ���� ������ �������� �з���
		System.out.println(linkedList3);	// [1, 1, 2, 2]
		
		// #5. set (int index, E element)
		linkedList3.set(2, 7);	// linkedList3�� 2�� �ڸ��� ���� 7�� ����
		linkedList3.set(3, 6);	// linkedList3�� 3�� �ڸ��� ���� 6���� ����
//		linkedList3.set(4, 9);	// IndexOutOfBoundsException �߻�. List�� ������ ��� ����� ����
		System.out.println(linkedList3);	// [1, 1, 7, 6]
		
		// #6. remove (int index)
		linkedList3.remove(1);	// 1�� �ڸ��� ���� ����. �ڸ� ���� ����� ��. 1 �̶�� ���� ������ �ƴ�
		System.out.println(linkedList3);	// [1, 7, 6]
		
		// #7. remove (Object o)
		linkedList3.remove(new Integer(7));	// linkedList3 ���� 7�̶�� ���� ����. List�� Ư������ ������ ���� ��ü�� ���� �����ؾ���
		System.out.println(linkedList3);	// [1, 6]
		
		// #8. clear()
		linkedList3.clear();	// ��� �� ����
		System.out.println(linkedList3);
		
		// #9. isEmpty() : ������ ������ true, false
		System.out.println(linkedList3.isEmpty());	// true
		
		// #10. size() : ���� ����
		System.out.println(linkedList3.size());	// 0
		linkedList3.add(1);
		linkedList3.add(2);
		linkedList3.add(3);
		System.out.println(linkedList3);	// [1, 2, 3]
		System.out.println(linkedList3.size());	// 3
		
		// #11. get(int index) : index�θ� ���� ������ �� ����
		System.out.println("0��° ������ : " + linkedList3.get(0));		// 1
		System.out.println("1��° ������ : " + linkedList3.get(1));		// 2
		System.out.println("2��° ������ : " + linkedList3.get(2));		// 3
		
		System.out.println();
		
		for (int i = 0; i < linkedList3.size(); i++) {
			System.out.println(i + "��° ������ : " + linkedList3.get(i));
		}
		
		// #12. toArray() List -> Array	: Object Ÿ������ ��ȯ
		Object[] obj = linkedList3.toArray();
		System.out.println(Arrays.toString(obj));	// [1, 2, 3]
		
		// #13-1. Arrays(T[] t) -> T[] Ÿ�� �迭 ��� (Object Ÿ���� �ٸ� Ÿ������ �Ź� ��ȯ�ϴ� ���ŷο��� �ذ�)
		Integer[] integer1 = linkedList3.toArray(new Integer[5]);	// linkedList3�� [1, 2, 3] 3���� ���� �������� 5���� ũ�⸦ ����
		System.out.println(Arrays.toString(integer1));	// [1, 2, 3, null, null] -> 5�� ũ�� �� 3���� ���� ������ ������ �ڸ��� null�� ä��
		
		// 13-2. Arrays(T[] t) -> T[] Ÿ�� �迭 ��� 
		Integer[] integer2 = linkedList3.toArray(new Integer[2]);	// List�� �� �������� �迭�� ���� ���� �����ϸ� ������ �� ũ�⸸ŭ �����Ϸ��� �ڵ����� ����
		// �����Ϸ��� �ڵ����� ������ �� ũ�⸸ŭ �����ϱ� ������ [0]���� �����ϴ� ��찡 ����
		System.out.println(Arrays.toString(integer2));	// [1, 2, 3] 
	}
}
