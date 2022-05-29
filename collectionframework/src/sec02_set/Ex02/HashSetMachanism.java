package sec02_set.Ex02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class A {
	int data;

	public A(int data) {
		this.data = data;
	}
}

class B {
	int data;
	
	public B(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof B) {
			if (this.data == ((B)obj).data) {
				return true;
			} 
				return false;
			}
		return false;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}

class C {
	int data;
	
	public C(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof C) {
			if (this.data == ((C)obj).data) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// #방법 1
		return Objects.hash(data);	// 데이터의 위치를 기반으로 hashCode를 만드는 것이 아니라 data를 기반으로 hashCode 생성
		// #방법 2
//		return data;
	}	
}

public class HashSetMachanism {

	public static void main(String[] args) {
		// #1. 어떤 것도 오버라이딩하지 않은 상태
		 Set<A> hashSet1 = new HashSet<>();
		 
		 A a1 = new A(3);
		 A a2 = new A(3);
		 
		 System.out.println(a1 == a2);	// false
		 System.out.println(a1.equals(a2));	// false. Object의 equals를 사용하여 == 랑 동일한 결과
		 System.out.println(a1.hashCode() + ", " + a2.hashCode());
		 hashSet1.add(a1);
		 hashSet1.add(a2);
		 System.out.println(hashSet1.size());	// 2
		 
		 System.out.println();
		 
		 // #2. equals() 오버라이딩
		 Set<B> hashSet2 = new HashSet<>();
		 
		 B b1 = new B(3);
		 B b2 = new B(3);
		 
		 System.out.println(b1 == b2);	// false
		 System.out.println(b1.equals(b2));	// true
		 System.out.println(b1.hashCode() + ", " + b2.hashCode());
		 hashSet2.add(b1);
		 hashSet2.add(b2);
		 System.out.println(hashSet2.size());	// 2
		 
		 System.out.println();
		 
		 // #3. equals(), hashCode() 오버라이딩
		 Set<C> hashSet3 = new HashSet<>();
		 
		 C c1 = new C(3);
		 C c2 = new C(3);
		 
		 System.out.println(c1 == c2);	// false
		 System.out.println(c1.equals(c2));	// true
		 System.out.println(c1.hashCode() + ", " + c2.hashCode());
		 hashSet3.add(c1); 
		 hashSet3.add(c2);	// hashCode가 동일하기 때문에 HashSet이 c1과 동일하다고 생각하여 c2를 넣지 않음
		 System.out.println(hashSet3.size());	// 1
	}
}
