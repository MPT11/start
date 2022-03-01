package day05;

/*
 *  나이를 입력받아서
 *  	유년기
 *  	10대
 *  	20대
 *  	30대
 *  	40대
 *  	장년층
 *  으로 구분해서 출력하세요
 */
import java.util.*;

public class Test03 {

	public static void main(String[] args) 
	{
		System.out.print("나이를 입력해주세요 : ");
		
		Scanner s = new Scanner(System.in);
		
		int age = s.nextInt();
		
		String re = "정수";
		
		if(age != 0 && age < 10)
		{
			re = "유년기";
		}
		else if(age >= 10 && age <20)
		{
			re = "10대";
		}
		else if(age>= 20 && age <30)
		{
			re = "20대";
		}
		else if(age>= 30 && age <40)
		{
			re = "30대";
		}
		else if(age>= 40 && age <50)
		{
			re = "40대";
		}
		else
		{
			re = "장년층";
		}
		
		System.out.println("당신의 연령층은 " + re + "입니다");
	}

}
