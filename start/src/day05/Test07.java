package day05;

/*
 * 	1부터 6까지를 기억하는 배열의 데이터를
 * 	꺼내서 출력하시요
 * 
 * 	참고 ] 
 * 		배열 : 타입이 같은 데이터를 일정갯수만큼 모아서 하나로
 * 			   관리하도록 만들어놓은 자바의 데이터 타입
 */

public class Test07 {

	public static void main(String[] args) 
	{
		int[] numArray = {1,2,3,4,5,6};
		
		for(int i = 0 ; i < numArray.length; i++)
		{
			System.out.println((i+1) + "번째 데이터 : " + numArray[i]);
		}
		
		for(int num : numArray)
		{
			System.out.println("### " + num);
		}
	}

}
