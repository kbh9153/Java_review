package sec03_genericmethod.Ex02;

class A {
	public <T> void method(T t) {
//		System.out.println(t.length());		// �Ұ��� : Object �޼ҵ常 ȣ�� ����
		System.out.println(t.equals("�ȳ��ϼ���"));	// Object �޼ҵ常 ȣ�� ����
	}
}

public class AvailableMethodInGenericMethod {
	
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("�ȳ��ϼ���");
	}
}
