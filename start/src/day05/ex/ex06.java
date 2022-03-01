package day05.ex;
/*문제 6 ]
		랜덤하게 정수를 컴퓨터가 만들어 내면
		그 수를 알아맞추는 게임을 만드세요.
		
		예 ]
			
			발생숫자 : 54
			
			사용자입력숫자 : 45
			
			==> "입력한 수가 더 작습니다."
			로 메세지 를 출력해서 사용자가 숫자를 알아맞추는 게임...
			
			횟수도 같이 출력되게 하세요.
*/	

import java.util.*;

public class ex06 {
	public static void main(String[] args) 
	{
		System.out.println("스무고개 게임입니다.");
		System.out.println("숫자를 지정하고있습니다");
		System.out.println("숫자의 범위는 1~100까지 입니다");
		int num = (int)(Math.random() * (100 - 1 + 1) + 1);
		int i = 0;
				
		while(i < 20)
		{
			System.out.print("숫자를 입력해주세요 : ");
			Scanner s = new Scanner(System.in);
			int use = s.nextInt();
			if(use == num)
			{
				System.out.println("생성된 숫자와 동일합니다 게임을 종료합니다");
				break;
			}
			else
			{
				if(use > num)
				{
					System.out.println("입력하신 숫자가 더 큽니다.");
					System.out.println((i+1)+"번째 입력 입니다");
				}
				else
				{
					System.out.println("입력하신 숫자가 더 작습니다.");
					System.out.println((i+1)+"번째 입력 입니다");
				}
			}
			i++;
		}
		System.out.println("게임을 종료합니다.");
	}

}
