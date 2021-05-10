package all;

public class ReverseString {
	
	public static void main(String[] args) {
		
	String s="abcde";
	String rev="";
	
	for(int i=(s.length()-1);i>=0;i--)
	{
		rev=rev+s.charAt(i);
		
	}
		System.out.println(rev);
		
//	int num=12345;
//	int rev=0;
//	int rem;
//	
//	while(num!=0)
//	{
//		rem=num%10;
//		rev=rev*10+rem;
//		num=num/10;
//		System.out.println(rev);
//	}
		
		
	}

}
