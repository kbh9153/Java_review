package sec01_list.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsList {

	public static void main(String[] args) {
		// #1.
		String[] array = new String[] {"��", "��", "��", "��", "��", "��", "��"};
		
		array[2] = null;
		array[5] = null;
		
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		
		System.out.println(array.length);
		System.out.println();
		
		// #2.
		List<String> alist = new ArrayList<>();
		
		System.out.println(alist.size());	// �������� ���� ���ϱ�
		
		alist.add("��");
		alist.add("��");
		alist.add("��");
		alist.add("��");
		alist.add("��");
		alist.add("��");
		alist.add("��");
		System.out.println(alist.size());	// �������� ���� ���ϱ�
		
		alist.remove("��");
		alist.remove("��");
		System.out.println(alist.size());	// �������� ���� ���ϱ�
		System.out.println(alist);
	}
}
