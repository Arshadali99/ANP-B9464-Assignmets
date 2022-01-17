
public class Demo_B extends Demo_A 
{
	public void arrASC()
	{
		System.out.println("\nArray in Ascending Order:");
		int j,temp;
		int[]arr=accept();
		System.out.println("\nThe no are :");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nAscending Order :");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}
