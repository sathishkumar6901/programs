import java.util.*;
public class program72b
{
	static int removeDuplicate(int arr[],int n)
	{
		int j=0;
		for(int i=0;i<n-1;i++)
			if(arr[i]!=arr[i+1])
				arr[j++]=arr[i];
		arr[j++]=arr[n-1];
		return j;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		n=removeDuplicate(arr,n);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
    }
}