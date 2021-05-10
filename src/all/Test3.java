package all;

public class Test3 {
	
	static int i=20;
	static int j=30;
	public static void m1()
	{
		System.out.println(i);
		System.out.println("staic variable value is:"+i);
		System.out.println(Test3.i);
	}
	public void m2()
	{
		System.out.println(j);
		System.out.println("staic variable value is:"+j);
		System.out.println(Test3.j);
	}
	public static void main(String[] args) {
		//m1();
		Test3 t=new Test3();
		//t.m2();
		//int k=j+40;
		//System.out.println(k);
		System.out.println("value of static variable:"+i);
		System.out.println("befor changing the value:"+Test3.i);
		
	i=50;
	System.out.println("value of static variable:"+i);
	System.out.println("befor changing the value:"+Test3.i);
	
	Test3 tt=new Test3();
	System.out.println("value of static variable:"+i);
	System.out.println("befor changing the value:"+Test3.i);
	
		
		
	}

}
