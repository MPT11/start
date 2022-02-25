package day04.ex;

/*
 * 문제 3]
 * 		게시물을 게시판에 출력하는데
 * 		하나의 페이지에 게시물을 15개를 출력할 예정이다.
 * 		게시물 수를 랜덤하게 발생시켜서
 * 		게시판의 페이지가 몇페이지가 필요한지 계싼해서
 * 		출력해주는 프로그램을 작성하세요.
 * 
 * 		참고 ] 
 * 			게시물이 없는 경우는 
 * 			게시물이 없는 페이지가 적어도 1페이지는 필요하다
 */


public class ex03 {
	public static void main(String...args)
	{
		//게시물 발생
		int num = (int)(Math.random() * (100 - 1 + 1) + 1);
		System.out.println("생성된 게시물 개수는 : " + num + "개 입니다");
		int page = num / 15;
		if (num % 15 == 0)
		{
			System.out.println("필요한 페이지의 수는 : " + page + "입니다");
		}
		else 
		{
		int page1 = page +1;
		System.out.println("필요한 페이지의 수는 : " + page1 + "입니다");
		}
		
	}

}
