package sec02_string;

public class Quiz {
	
	public static void main(String[] args) {
		// #Q8
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
		String name;
		int age;

		int sta1 = str.indexOf('[');
		int end1 = str.indexOf(']');
		
		int sta2 = str.lastIndexOf('[');
		int end2 = str.lastIndexOf(']');
		
		name = str.substring(sta1 + 1, end1);
		age = Integer.parseInt(str.substring(sta2 + 1, end2));
		
		System.out.println(name);
		System.out.println(age);
		
	}
}
