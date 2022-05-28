package sec01_list.Ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

// Vector�� �ڵ����� ����ȭ�Ǿ� ��Ƽ �����忡 ����
public class VectorMethod {

	public static void main(String[] args) {
		List<Integer> vector1 = new Vector<Integer>();
		
		// #1. add (E element)
		vector1.add(3);
		vector1.add(4);
		vector1.add(5);
		System.out.println(vector1.toString());
		System.out.println(vector1);	// toString() �����Ͽ��� ��°� ����. �����ҽ� println�� toString()�� ȣ������
		
		// #2. add (int index, E element)
		vector1.add(1, 6);	// 1�� �ڸ��� 6�� �߰�. ���� ������ �������� �з���
		System.out.println(vector1);	// [3, 6, 4, 5]
		
		// #3. addAll (�� �ٸ� List ��ü)
		List<Integer> vector2 = new Vector<>();
		vector2.add(1);
		vector2.add(2);
		vector2.addAll(vector1);	// ������ ������ vector1�� ������ �߰�
		System.out.println(vector2);	// [1, 2, 3, 6, 4, 5]
		
		// #4. addALL (int index, E element)
		List<Integer> vector3 = new Vector<>();
		vector3.add(1);
		vector3.add(2);	
		vector3.addAll(1, vector3);	// 1�� �ڸ��� vector3 ������ ������ �߰�. ���� ������ �������� �з���
		System.out.println(vector3);	// [1, 1, 2, 2]
		
		// #5. set (int index, E element)
		vector3.set(2, 7);	// vector3�� 2�� �ڸ��� ���� 7�� ����
		vector3.set(3, 6);	// vector3�� 3�� �ڸ��� ���� 6���� ����
//		vector3.set(4, 9);	// IndexOutOfBoundsException �߻�. List�� ������ ��� ����� ����
		System.out.println(vector3);	// [1, 1, 7, 6]
		
		// #6. remove (int index)
		vector3.remove(1);	// 1�� �ڸ��� ���� ����. �ڸ� ���� ����� ��. 1 �̶�� ���� ������ �ƴ�
		System.out.println(vector3);	// [1, 7, 6]
		
		// #7. remove (Object o)
		vector3.remove(new Integer(7));	// vector3 ���� 7�̶�� ���� ����. List�� Ư������ ������ ���� ��ü�� ���� �����ؾ���
		System.out.println(vector3);	// [1, 6]
		
		// #8. clear()
		vector3.clear();	// ��� �� ����
		System.out.println(vector3);
		
		// #9. isEmpty() : ������ ������ true, false
		System.out.println(vector3.isEmpty());	// true
		
		// #10. size() : ���� ����
		System.out.println(vector3.size());	// 0
		vector3.add(1);
		vector3.add(2);
		vector3.add(3);
		System.out.println(vector3);	// [1, 2, 3]
		System.out.println(vector3.size());	// 3
		
		// #11. get(int index) : index�θ� ���� ������ �� ����
		System.out.println("0��° ������ : " + vector3.get(0));		// 1
		System.out.println("1��° ������ : " + vector3.get(1));		// 2
		System.out.println("2��° ������ : " + vector3.get(2));		// 3
		
		System.out.println();
		
		for (int i = 0; i < vector3.size(); i++) {
			System.out.println(i + "��° ������ : " + vector3.get(i));
		}
		
		// #12. toArray() List -> Array	: Object Ÿ������ ��ȯ
		Object[] obj = vector3.toArray();
		System.out.println(Arrays.toString(obj));	// [1, 2, 3]
		
		// #13-1. Arrays(T[] t) -> T[] Ÿ�� �迭 ��� (Object Ÿ���� �ٸ� Ÿ������ �Ź� ��ȯ�ϴ� ���ŷο��� �ذ�)
		Integer[] integer1 = vector3.toArray(new Integer[5]);	// vector3�� [1, 2, 3] 3���� ���� �������� 5���� ũ�⸦ ����
		System.out.println(Arrays.toString(integer1));	// [1, 2, 3, null, null] -> 5�� ũ�� �� 3���� ���� ������ ������ �ڸ��� null�� ä��
		
		// 13-2. Arrays(T[] t) -> T[] Ÿ�� �迭 ��� 
		Integer[] integer2 = vector3.toArray(new Integer[2]);	// List�� �� �������� �迭�� ���� ���� �����ϸ� ������ �� ũ�⸸ŭ �����Ϸ��� �ڵ����� ����
		// �����Ϸ��� �ڵ����� ������ �� ũ�⸸ŭ �����ϱ� ������ [0]���� �����ϴ� ��찡 ����
		System.out.println(Arrays.toString(integer2));	// [1, 2, 3] 
	}
}
