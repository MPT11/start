package day03.ex;

/*
 * 1년은 365.2426일이다
 * 이것은 과연 몇일 몇시간 몇분 몇초인지를 계산하고 출력하세요
 * 
 * 365.2426일은 단위가 일단위이다.
 * 하루는 24시간이다.
 * 따라서 0.5일은 12시간을 의미한다.
 */
import java.util.*;

public class ex04 {
	public static void main(String...args) {
			
		double year = 365.2426;
		
		//System.out.print("1년은 : " + year);
		
		int day = (int)year;
		double remainhour = year % 1 * 24;
		int hour = (int)remainhour;
		double remainmin = remainhour % 1 * 60;
		int min = (int)remainmin;
		double remaninsec= remainmin %1 *60;
		int sec = (int)remaninsec;
		
		System.out.print("1년은 " + day + "일 " + hour + "시간 " + min + "분 " + sec + "초 입니다 " );
		
		
		
		
	}
}
