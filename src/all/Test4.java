package all;

public class Test4 {
	
	int i=50;
	
	public static void m1()
	{
		Test4 w= new Test4();
		System.out.println(w.i);
		System.out.println("value of non variable:"+w.i);
	}
	public void m2()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		
	//	m1();
	//	Test4 w= new Test4();
	//	w.m2();
		Test4 tt= new Test4();
		System.out.println("value of not staic varibale:"+tt.i);
		tt.i=100;
		tt.m2();
		System.out.println("value of not staic varibale:"+tt.i);
		
	}

}
