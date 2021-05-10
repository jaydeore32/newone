package all;

public class Test5 {
	
	int a=10;
	static int i=20;
	
	public void m1()
	{
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(Test5.i);
		
	}
	public static void m2()
	{
		int i=40;
		System.out.println(i);
		Test5 t=new Test5();
		System.out.println(t.i);
		System.out.println(Test5.i);
	}
	public static void main(String[] args) {
		
		Test5 tt=new Test5();
		tt.m1();
		m2();
	}

}
