package sec05_InnerInterface.Ex02;

class Button {
	OnClickListener ocl;
	
	void setOnClickListener(OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	interface OnClickListener {
		public abstract void onClick();
	}
	
	void onClick() {
		ocl.onClick();
	}
}

public class ButtonAPIExample {

	public static void main(String[] args) {
		// #1. 개발자 1. 클랙했을 때 음악재생
		Button btn1 = new Button();
		
		btn1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자 1 : 음악 재생");
			}
		});
		
		btn1.onClick();		// 개발자 1 : 음악 재생
		
		// #2. 개발자 2.
		Button btn2 = new Button();
		
		btn2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자 2 : 네이버 접속");
			}
		});
		
		btn2.onClick();		// 개발자 2 : 네이버 접속
	}
}
