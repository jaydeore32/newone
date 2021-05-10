package all;

public class String1 {
	
	public static void main(String[] args) {
		
		String s="abcd1234efg567";
		
		char[] ss=s.toCharArray();
		
				
		
		for(char sss:ss)
       {
			if(Character.isDigit(sss))
			{
			System.out.print(sss);
       }
	   }
		
	   for(char ssss:ss)
	       {
				if(!Character.isDigit(ssss))
				{
				System.out.print(ssss);
	       }
}
}
}