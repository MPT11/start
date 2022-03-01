package day05.ex;

/*
 * 문제 5 ]
 * 		컴퓨터와 사용자 사이의 가위바위보 게임을 한다
 * 		
 * 		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
 * 		가위, 바위 , 보로 가정하고 
 * 		사용자는 키보드를 이용해서 1 ~ 3사이의 숫자를 입력하도록 한다.
 * 
 * 		누가 이겼는지를 확인하는 프로그램을 작성하세요
 */

import java.util.*;

public class ex05 {

	public static void main(String[] args) 
	{
		//입력 도구
		System.out.print("숫자 1(가위) 2(바위) 3(보)중 하나를 입력해주세요 : ");
		Scanner s = new Scanner(System.in);
		int user = s.nextInt();
		String user_str = "";
		//컴퓨터 숫자 발생
		int num = (int)(Math.random() * (3 - 1 + 1) + 1);
		String num_str = "";
		
		switch(user)
		{
		case 1 : user_str = "가위";break;
		case 2 : user_str = "바위";break;
		case 3 : user_str = "보";break;
		}
		switch(num)
		{
		case 1 : num_str = "가위";break;
		case 2 : num_str = "바위";break;
		case 3 : num_str = "보";break;
		}
		
		if(user == num)
		{
			System.out.println("유저는 : " + user_str );
			System.out.println("컴퓨터는 : " + num_str );
			System.out.println("비겼습니다.");
		}
		else if(user == 1 && num == 2)
		{
			System.out.println("유저는 : " + user_str );
			System.out.println("컴퓨터는 : " + num_str );
			System.out.println("컴퓨터가 승리하였습니다.");
		}
		else if(user == 1 && num == 3)
		{
			System.out.println("유저는 : " + user_str );
			System.out.println("컴퓨터는 : " + num_str );
			System.out.println("유저가 승리하였습니다.");
		}
		else if(user == 2 && num == 1)
		{
			System.out.println("유저는 : " + user_str );
			System.out.println("컴퓨터는 : " + num_str );
			System.out.println("유저가 승리하였습니다.");
		}
		else if(user == 2 && num == 3)
		{
			System.out.println("유저는 : " + user_str );
			System.out.println("컴퓨터는 : " + num_str );
			System.out.println("컴퓨터가 승리하였습니다.");
		}
		else if(user == 3 && num == 1)
		{
			System.out.println("유저는 : " + user_str );
			System.out.println("컴퓨터는 : " + num_str );
			System.out.println("컴퓨터가 승리하였습니다.");
		}
		else if(user == 3 && num == 2)
		{
			System.out.println("유저는 : " + user_str );
			System.out.println("컴퓨터는 : " + num_str );
			System.out.println("유저가 승리하였습니다.");
		}
	}

}
