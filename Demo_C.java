
public class Demo_C extends Demo_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_C obj=new Demo_C();
		obj.arrASC();
		obj.grt();
	}

	public void grt()
	{
		System.out.println("GRT of 3 No");
		int[]arr=accept();
		System.out.println("The no are :");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println("Thye process of GRT ");
	}
}
