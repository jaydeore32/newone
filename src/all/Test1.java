package all;

public class Test1 {
	
	

	public static void m1()
	{
		System.out.println("static method");
	}
	
	public void m2()
	{
		System.out.println("non static method");
		m5();
	}
	
	public static void m5()//static in static
	{
		m1();
		Test2.m3();
		
	}
	
	public void m6()
	{
		m2();
		Test2 b= new Test2();
		b.m4();
	}
	public static void main(String[] args) {
		
		Test1 a= new Test1();
		a.m2();
		m5();
		a.m6();
		
	}
}
