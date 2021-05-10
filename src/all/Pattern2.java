package all;

public class Pattern2 {

	public static void main(String[] args) {	
   //Asending order of * patter
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
	
    //Decending Order
    for(int i=1;i<=5;i++)
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
    }
    System.out.println();
    }
    
    //piramid pattern of *
    for(int i=1;i<=3;i++)
    {
    for(int j=1; j<=5;j++)
    {
    	if(j>=(4-i)&&j<=(2+i))
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
    
    

    
}
}
