import java.util.*;
public class program10b
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
		int i=0,j=n-1;
		while(i<=j)
		{
			result.add(arr[j--]);
			result.add(arr[i++]);
		}
		System.out.print(result);
	}
}
