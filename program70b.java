import java.util.*;
public class program70b
{
	static int findMax(int max,int arr[],int n)
	{
		int large=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>large && arr[i]<max)
				large=arr[i];
		}
		return large;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int max = Integer.MAX_VALUE;
		for(int i=0;i<2;i++)
		{
			max=findMax(max,arr,n);
		}
		if(n<2)
			System.out.println("There is no 2nd large number");
		else
			System.out.println("The 2nd largest number is: "+max);
    }
}