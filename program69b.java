import java.util.*;
public class program69b
{
	static void rotateArray(int[] arr,int n,int d)
	{
		int[] temp = new int[n]; 
		int k=0;
		for(int i=n-d;i<n;i++)
			temp[k++]=arr[i];
		for(int i=0;i<n-d;i++)
			temp[k++]=arr[i];
		for(int i=0;i<n;i++)
			arr[i]=temp[i];
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		rotateArray(arr,n,1);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
    }
}