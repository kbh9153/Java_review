package sec01_theneedforgeneric.Ex01;

// #1. Apple Ŭ������ Apple Ŭ������ ���� �� �ִ� Ŭ����
class Apple {}

class Goods1 {
	private Apple apple = new Apple();

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

// #2. Pencil Ŭ������ Pencil Ŭ������ ���� �� �ִ� Ŭ����
class Pencil {}

class Goods2 {
	private Pencil pencil = new Pencil();

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}

public class ProblemBeforeGeneric {
	
	public static void main(String[] args) {
		// #1. Goods1�� ���ؼ� Apple ��ü �߰� �� ��������
		Goods1 goods1 = new Goods1();
		
		goods1.setApple(new Apple());
		Apple apple = goods1.getApple();
		
		// #2. Goods2�� ���ؼ� Pencil ��ü �߰� �� ��������
		Goods2 goods2 = new Goods2();
		
		goods2.setPencil(new Pencil());
		Pencil pencil = goods2.getPencil();
	}
}
