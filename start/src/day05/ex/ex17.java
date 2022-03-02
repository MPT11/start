package day05.ex;

/*
Ex02_01 ]
	3 ~ 10 사이의 정수를 랜덤하게 발생시켜서
	그 정수를 길이로 하는 영어 단어를 랜덤하게 만드세요.
	단, 시작문자는 대문자로 하고 나머지는 소문자로 하세요.
*/

public class ex17 {
	
	static int num , sum;
	static char aski;
	static String re = "";
		
		
	public static void main(String...args)
	{
		//정수 발생
		num = (int)(Math.random() * (10 - 3 + 1) + 3);
		
		for(int i = 0 ; i < num; i++)
		{
			if(i == 0)
			{
				aski = (char)(Math.random() * (90 - 65 + 1) + 65);
				re = re + aski;
			}
			else
			{
				aski = (char)(Math.random() * (122 - 97 + 1) + 97);
				re = re + aski;
			}
		}
		System.out.println("랜덤하게 생성된 정수의 길이로 만든 랜덤한 영단어는 : " + re);
	}
}
