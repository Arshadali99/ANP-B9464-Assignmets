public class Multi_Demo extends c
{

	public static void main(String[] args) 
	{
		met1();
		met2();
		met3();

	}

}
class a
{
	public static void met1()
	{
		System.out.println("Hiii from Class A");
	}
}
class b extends a
{
	public static void met2()
	{
		System.out.println("Hiii from Class B");
	}
}
class c extends b
{
	public static void met3()
	{
		System.out.println("Hiii from Class C");
	}
}