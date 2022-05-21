package sec02_genericclass.Ex01;

class MyClass<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class SingleGenericArgument {

	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>();
		mc1.setT("�ȳ��ϼ���");
		
		MyClass<Integer> mc2 = new MyClass<>();	// ������ �κп����� Ÿ�� ���� ����(Ŭ���� �κп��� ����Ͽ��� ����)
		mc2.setT(31);
		
//		MyClass<Integer> mc3 = new MyClass<>();
//		mc3.setT("�ȳ�");	// �����߻�. ���� Ÿ��üũ

		System.out.println(mc1.getT());
		System.out.println(mc2.getT());
		
		
		
	}
}
