package day02;

public class Example1 {
	//변수
	private int data;
	//생성자
	public Example1(int data) {
		//변수 값 설정
		this.data = data;
	}
	//더하기 함수
	public Example1 sum(int data) {
		//변수값에 가산
		this.data += data;
		//콘솔 출력
		return print();
	}
	//출력함수
	public Example1 print() {
		//콘솔 출력
		System.out.println("data - " + this.data);
		//자기 클래스를 리턴
		return this;
	}
	
	public static void main(String...args) {
		//Example1 클래스 선언
		Example1 ex = new Example1(0);
		//for문을통한 10까지의 합산을 sum함수를 통해 불러오는데
		//sum 함수는 print 함수를 포함하고있기에 매 회차마다
		//합산된 값을 리턴하게되있음
		for (int i = 0; i < 11; i++ ) {
			ex.sum(i);
		}
		//콘솔 출력
		System.out.println("ex data return");
		//결과 출력
		ex.print();
	}

}
