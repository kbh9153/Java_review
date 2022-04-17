package InheritancePolymorphism.Ex01;

class Human {
	String name;
	int age;
	
	void eat() {
		System.out.println("먹기");
	}
	
	void sleep() {
		System.out.println("자기");
	}
}

class Student extends Human {
	int sutentID;
	
	void goToSchool() {
		System.out.println("등교하기");
	}
}

class Worker extends Human {
	int workerID;
	
	void goToWork() {
		System.out.println("출근하기");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// #1. Human 객체 생성
		Human h = new Human();
		
		h.name = "홍길동";
		h.age = 15;
		System.out.println(h.name);
		System.out.println(h.age);
		h.eat();
		h.sleep();
		
		System.out.println();
		
		// #2. Student 객체 생성
		Student s = new Student();
		
		s.name = "김철수";
		s.age = 17;
		System.out.println(s.name);
		System.out.println(s.age);
		s.eat();
		s.sleep();
		
		s.sutentID = 123;
		System.out.println(s.sutentID);
		s.goToSchool();
		
		System.out.println();
		
		// #3. Worker 객체 생성
		Worker w = new Worker();
		
		w.name = "김영민";
		w.age = 30;
		System.out.println(w.name);
		System.out.println(w.age);
		w.eat();
		w.sleep();

		w.workerID = 321;
		System.out.println(w.workerID);
		w.goToWork();
	}
}
