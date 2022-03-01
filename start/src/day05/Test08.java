package day05;

// 참고 for(;;) 무한반복임
public class Test08 {
	public static void main(String...args)
	{
		
		for(int i = 0 ; ; i++)
		{
		int no = i +1;
		
		if(no>50)
		{
			break;
		}
		System.out.print(no + " , ");
		
		}
		
		System.out.println("끝");
		
		int no = 1;
		while(true)
		{
			System.out.print(no + " , ");
			no++;
			if(no > 50)
			{
				break;
			}
		}
		System.out.println("끝");
		
	}

}
