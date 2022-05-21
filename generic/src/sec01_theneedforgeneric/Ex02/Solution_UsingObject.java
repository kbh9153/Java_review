package sec01_theneedforgeneric.Ex02;

//#1. Apple, Pencil 클래스를 모두 저장하고 꺼낼 수 있는 클래스
class Apple {}
class Pencil {}

class Goods {
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}


public class Solution_UsingObject {
	
	public static void main(String[] args) {
		// #1. Goods1을 통해서 Apple 객체 추가 및 가져오기
		Goods goods1 = new Goods();
		goods1.setObject(new Apple());
		Apple apple = (Apple)goods1.getObject();
		
		// #2. Goods2을 통해서 Pencil 객체 추가 및 가져오기
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil());
		Pencil pencil = (Pencil)goods2.getObject();
		
		// #3. 잘못된 캐스팅(약한 체크타입)
//		Goods goods3 = new Goods();
//		goods3.setObject(new Apple());
//		Pencil pencil2 = (Pencil)goods3.getObject();	// ClassCastException(실행예외) 발생
	}
}
