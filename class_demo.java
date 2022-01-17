import java.util.Scanner;

public class class_demo extends par1 {

	public static void main(String[] args) {
		grt3();
		System.out.println("Two balye  a="+a+" and b="+b);
		
	
	}

}
class par1
{
	static int a,b;
	public static void grt3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two No");
		a=sc.nextInt();
		b=sc.nextInt();
	}
}

