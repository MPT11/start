package day02;
//클래스
public class Example {
	//변수
	private int data;
	//생성자
	public Example(int data) {
		setData(data);
	}
	//변수 설정
	public void setData(int data) {
		this.data = data;
	}
	//출력 함수
	public void print(String x) {
		//콘솔 출력
		System.out.println(x +  " : " + this.data);
	}
	//실행 함수
	public static void main(String... args) {
		//Example 클래스 선언
		Example ex1 = new Example(10);
		//ex1 변수를 ex2로 삽입
		Example ex2 = ex1;
		//hashcode 출력
		System.out.println("ex1 hashcode = " + ex1.hashCode());
		System.out.println("ex2 hashcode = " + ex2.hashCode());
		//ex2의 클래스 데이터 수정
		ex2.setData(20);
		//ex1의 data 콘솔 출력
		System.out.println("ex1 data");
		ex1.print("ex1");
		//es2의 data 콘솔 출력
		System.out.println("ex2 data");
		ex2.print("ex2");
	}

}
