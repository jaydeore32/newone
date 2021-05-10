package all;

public class Test7 {
	
	public void m1(int a, int b)//with argument and without return type
   {
		int c=a+b;
		System.out.println(c);
   }
   public void m2()//without argument and without retrun type
   {
	   int c=0;
	   System.out.println(c);
   }
   
   public boolean m3()
   {
	   return false;
   }
   
   public int m4()
   {
	   int e=5;
	   int f=10;
	   int g=e+f;
	   return g;
   }
   
   public int m5(boolean x,int y, double z)
   {
	   x=true;
	   y=2;
	   return 10;
   }
	public static void main(String[] args) {
		Test7 t=new Test7();
		t.m1(20, 30);
		t.m2();
		
		boolean d=t.m3();
		System.out.println(d);
		
		int h=t.m4();
		int j=h+20;
		System.out.println(j);
		
		int w=t.m5(true, 2, 10.10);
		System.out.println(w);
		
	}
}
