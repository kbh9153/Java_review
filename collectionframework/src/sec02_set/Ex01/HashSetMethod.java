package sec02_set.Ex01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {

	public static void main(String[] args) {
		Set<String> hSet1 = new HashSet<>();
		// #1. add(E element)
		hSet1.add("��");
		hSet1.add("��");
		hSet1.add("��");		// Set�� �ε��� ������ ���� �ߺ����� ������� ����
		System.out.println(hSet1.toString());	// [��, ��]. toString() ���� ����
		
		// #2. allAll(�ٸ� Set ��ü)
		Set<String> hSet2 = new HashSet<>();
		hSet2.add("��");
		hSet2.add("��");
		hSet2.addAll(hSet1);	// hSet1�� ���� �ߺ����� �ʴ� ���� �߰�
		System.out.println(hSet2);	// [��, ��, ��]. HashSet�� �Է� ������ ��� ������ �ٸ� �� ����
		
		// #3. remove(Object o)
		hSet2.remove("��");		// [��, ��]
		
		// #4. clear()
		hSet2.clear();
		System.out.println(hSet2);
		
		// #5. isEmpty()
		System.out.println(hSet2.isEmpty());	// true
		
		// #6. contains(Object o) : Ư�� �����Ͱ� �ִ��� Ȯ��
		Set<String> hSet3 = new HashSet<>();
		hSet3.add("��");
		hSet3.add("��");
		hSet3.add("��");
		System.out.println(hSet3.contains("��"));	// true
		System.out.println(hSet3.contains("��"));	// false
		
		// #7. size()
		System.out.println(hSet3.size());	// 3
		
		// #8. iterator() : iterator ��ü ���ο� �����͸� �ϳ��� ���� �� �ִ� ����� ����
		Iterator<String> iterator =  hSet3.iterator();
		
		while(iterator.hasNext()) {	// hasNext() : ������ ������ ���� ����. �� 3����
			System.out.println(iterator.next());	// next() : ���� �����ͷ� �̵�
		}
		
		// #9. toArray()
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray));	// [��, ��, ��]
		
		// #10-1. toArray[T[] t]
		String[] strArray1 = hSet3.toArray(new String[0]);	// �迭�� ���� ���� ������ �������� �۰� ������ �ڵ����� ������ ������ ���缭 ���� ����
		System.out.println(Arrays.toString(strArray1));	// [��, ��, ��]
		
		// #10-2. toArray[T[] t]
		String[] strArray2 = hSet3.toArray(new String[5]);	// �迭�� ���� ���� ������ �������� ũ�� ������ ������ �������� �ʰ��� ������ŭ null ������ �ʱ�ȭ
		System.out.println(Arrays.toString(strArray2));	// [��, ��, ��, null, null]
	}
}
