package all;

public class Test9 {
	
	public static void main(String[] args) {
		
	
		String s="I Am Har";
	    	
	   String rev="";
	   
	   String[] ss = s.split("\\s");
	   
	  for(int i=(ss.length-1);i>=0;i--)
	  {
		// System.out.print(ss[i]+" "); 
		  rev=rev+s.charAt(i);
	  }
	   System.out.print(rev);
	}

}
