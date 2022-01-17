import java.util.Scanner;

public class hie_inh 
{

	public static void main(String[] args)
	{
		

	}

}
class pr1
{
	public void met1()
	{
		//Accepting the values
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("Enter the size");
		size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("Enter"+size+" Numbers");
		for(i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		
		System.out.println(size+" Numbers are :");
		for(i=0;i<size;i++)
		{
			System.out.print(num[i]+"\t");
		}

	}
}
class pr2 extends pr1
{
	public void met2()
	{
		//GRT 3 NO
		
	}
}
class pr3 extends pr1
{
	public void met3()
	{
		// ARRAY ASC
	}
}
class pr4 extends pr1
{
	public void met4()
	{
		//SWAPPING OF TWO NO
	}
}