package day06.ex;

/*
 	문제 4 ]
 		다음 형태로 출력하세요
 		
 ***** j 5 i 1
 ****  j 4 i 2
 ***   j 3 i 3
 **	   j 2 i 4
 *     j 1 i 5
 
 *****
 *****
 *****
 *****
 *****
 
     * i 1 j 5
    ** i 2 j 4
   *** i 3 j 3
  **** i 4 j 2
 ***** i 5 j 1
 
 
   *
  ***
 *****
 
 
 */

public class ex04 {

	public static void main(String[] args) 
	{
		for(int i = 1; i < 6; i++)
		{
			for(int j = 1; j < 6; j ++)
			{
				if((j + i) >= 7)
				{
					System.out.print(" ");
				}
				else 
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i < 6; i++)
		{
			for(int j = 1; j < 6; j ++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i < 6; i++)
		{
			for(int j = 1; j < 6; j ++)
			{
				if((j + i) >= 6)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i < 4; i++)
		{
			int num = (i * 2) - 1;
			switch(num) 
			{
			case 1 :
				System.out.println("  *  ");
				break;
			case 3 :
				System.out.println(" *** ");
				break;
			case 5 : 
				System.out.println("*****");
				break;
			}
		}
		System.out.println();
		
		
	}

}
