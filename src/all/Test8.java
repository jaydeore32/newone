package all;

public class Test8 {
	
	int m;
	int e;
	int c;
	public Test8()
	{
		System.out.println("constructor is running");
	}
//	public Test8(int mm,int ee, int cc)
//	{
//		m=mm; 
//		e=ee;
//		c=cc;
//	}

	public Test8(int m, int e,int c)
	{
		this(10);
		System.out.println("three argument const");	
		}
	
	public Test8(int m)
	{
		this(10,false);
		System.out.println("one argument constr");
	
	}
	public Test8(int m,boolean n)
	{
		System.out.println("two argument Constr");
	}
	
public static void main(String[] args) {
	
Test8 bb1=new Test8(10,20,30);
//Test8 bb2=new Test8(10);
//Test8 bb3=new Test8(10,false);
//	Test8 bb4=new Test8(10,20,60);
//	System.out.println(bb2.c);
	
	
	
}
}
