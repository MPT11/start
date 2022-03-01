package day05.ex;

/*
 * ex02 ]
 * 		'A'부터 문자를 10개를 만들어서 출력하세요
 */

public class ex02 {

	public static void main(String[] args) 
	{
		//변수 생성
		char eg = 'A';
		int num = (int)eg;
		
		
		for(int i = 0 ; i <10 ; i ++)
		{
			System.out.println(eg);
			num = num+1;
			eg = (char)num;
		}
	}

}
