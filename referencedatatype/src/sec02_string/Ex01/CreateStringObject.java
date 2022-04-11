package sec02_string.Ex01;

public class CreateStringObject {

	public static void main(String[] args) {
		// #1. String 객체 생성 1
		String str1 = new String("안녕");
		System.out.println(str1);
		
		// #2. String 객체 생성 2
		String str2 = "안녕하세요";		// new 키워드 없이 리터럴로 바로 값을 할당
		System.out.println(str2);
	}
}
