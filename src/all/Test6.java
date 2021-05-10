package all;

public class Test6 {
	
	int roll;
	int math;
	int phy;
	
	public void details()
	{
		System.out.println("roll:"+roll);
		System.out.println("math:"+math);
		System.out.println("phy:"+phy);
	}
	
	public static void main(String[] args) {
		Test6 tt=new Test6();
		tt.roll=1;
		System.out.println("roll no:"+tt.roll);
		tt.math=50;
		System.out.println("math:"+tt.math);
		
		Test6 t=new Test6();
		t.roll=2;
		t.math=70;
		t.phy=95;
		t.details();
		
	}

}
