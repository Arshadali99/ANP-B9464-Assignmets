import java.util.Scanner;

public class exp_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int n1,n2;
		System.out.println("Enter tywo numbers:");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		int res=n1/n2;
		System.out.println("Division "+res);
		
		try 
		{
		int[] arr=new int[3];
		arr[10]=20;
		System.out.println("Array value"+arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The array is out of bound");
			
		}
		
		}
		
		catch(NullPointerException e)
		{
			System.out.println("The second no cannopt be zero .");
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		finally
		{
		 System.out.println("The final block");	
		}
	}
	

}
