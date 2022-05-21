package sec02_genericclass.Ex03;

class Apple {}
class Pencil {}

class Goods<T> {
	private T t;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}


public class Solution_Generic {
	
	public static void main(String[] args) {
		// #1. Goods�� ���ؼ� Apple ��ü �߰� �� ��������
		Goods<Apple> goods1 = new Goods<>();	// <>�� Ÿ���� ������� ������ �ֻ��� Ŭ������ Object�� ������
		
		goods1.setT(new Apple());
		Apple apple = goods1.getT();	// �ٿ�ĳ���� �ʿ����
		
		// #2. Goods�� ���ؼ� Pencil ��ü �߰� �� ��������
		Goods<Pencil> goods2 = new Goods<>();
		
		goods2.setT(new Pencil());
		Pencil pencil = goods2.getT();
		
		// #3. �߸��� ĳ���� (���� Ÿ��üũ)
//		Goods<Apple> goods3 = new Goods<>();
		
//		goods3.setT(new Apple());
//		Pencil pencil = goods3.getT();
		
	}
}

