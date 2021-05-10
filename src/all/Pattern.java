package all;

public class Pattern {

	public static void main(String[] args) {
		// 5start pattern
//		for(int j=0; j<5; j++)
//		{	
//		for(int i=0; i<5;i++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//		}
		//asending order pattern
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=5;j++)
		{
			if(j<=i)
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
		// decending order paern
		for(int i=1; i<=5;i++)
		{
		for(int j=1;j<=5;j++)
		{
			if(j<=(6-i))
			{
			System.out.print("*");
		}
			else
			{
				System.out.print(" ");
			}
		System.out.println();
		}
		}
	}
}
