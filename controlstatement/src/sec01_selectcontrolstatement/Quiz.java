package sec01_selectcontrolstatement;

public class Quiz {

	public static void main(String[] args) {
		// #Q1
		int score = 72;
		
		if (90 > score && score >= 80) {
			System.out.println("B학점");
		} else if (90 <= score) {
			System.out.println("A학점");
		} else if (80 > score && score >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}
		
		// #Q2
		int score1 = 72;
		
		switch (score1 / 10) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			default:
				System.out.println("F학점");
				
		}

	}

}
