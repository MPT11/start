package day05.ex;

public class ex16_1 
{
	public static void main(String...args)
	{
		for(int i = 0; i <2 ; i++)
		{
			for(int j = 0 ; j< 9 ; j++)
			{
				for(int k = 0 ; k <4 ; k++)
				{
					int dan = 2 * k + 2 + i;
					int gop = j + 1;
					System.out.print(dan + " * " + gop + " = " +(dan*gop)+ "	");
				}
				System.out.println();
			}
			
			System.out.println();
		}
	}
}
