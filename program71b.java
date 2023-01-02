import java.util.*;
public class program71b
{
	static int findMax(int min,int arr[],int n)
	{
		int small=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]<small && arr[i]>min)
				small=arr[i];
		}
		return small;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int min = Integer.MIN_VALUE;
		for(int i=0;i<2;i++)
		{
			min=findMax(min,arr,n);
		}
		if(n<2)
			System.out.println("There is no 2nd large number");
		else
			System.out.println("The 2nd largest number is: "+min);
    }
}