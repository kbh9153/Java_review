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
		// #1. Goods을 통해서 Apple 객체 추가 및 가져오기
		Goods<Apple> goods1 = new Goods<>();	// <>에 타입을 명시하지 않으면 최상위 클래스인 Object로 설정됨
		
		goods1.setT(new Apple());
		Apple apple = goods1.getT();	// 다운캐스팅 필요없음
		
		// #2. Goods을 통해서 Pencil 객체 추가 및 가져오기
		Goods<Pencil> goods2 = new Goods<>();
		
		goods2.setT(new Pencil());
		Pencil pencil = goods2.getT();
		
		// #3. 잘못된 캐스팅 (강한 타입체크)
//		Goods<Apple> goods3 = new Goods<>();
		
//		goods3.setT(new Apple());
//		Pencil pencil = goods3.getT();
		
	}
}

