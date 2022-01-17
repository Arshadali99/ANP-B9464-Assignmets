
public class multiple_demo implements inf1,inf2{

	public static void main(String[] args) 
	{
		multiple_demo obj=new multiple_demo();
		obj.process();
		

	}
	public void process()
	{
		System.out.println("The process method of class ");
		demo1();
		demo2();
	}
	@Override
	public void demo2() {
		System.out.println("The demo2 Method of INTERFACE");
		
	}

	@Override
	public void demo1() {
		System.out.println("The demo1 Method of INTERFACE");
		
	}

}
