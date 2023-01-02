import java.util.*;
public class program10a
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		LinkedHashSet<Integer> result=new LinkedHashSet<Integer>();
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		int min,max;
		for(int i=0;i<n;i++)
		{
		    min=arr[i];
		    max=arr[i];
		    for(int j=i+1;j<n;j++)
		    {
		        if(arr[j]>max)
		            max=arr[j];
		        if(arr[j]<min)
		            min=arr[j];
		    }
		    result.add(max);
		    result.add(min);
		    n--;
		}
		System.out.print(result);
	}
}
