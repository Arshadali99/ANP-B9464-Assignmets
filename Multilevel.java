
public class Multilevel 
{
	 int num=10;
	public static void main(String[] args)
	{
		pro11 obj=new pro11();
		obj.demo();
		Multilevel obj1=new Multilevel();
		obj1.demo();
		obj1.demo1();
		hi();
		System.out.println("My variable value is="+obj1.num);
	}
	public  void demo()
	{
		System.out.println("the value of num is="+num);
	}
	public  void demo1()
	{
		System.out.println("the value of num is="+num);
	}
	public static void hi()
	{
		System.out.println("Bye");
	}

}
