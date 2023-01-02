import java.util.*;
public class program54
{
	static void swapElements(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(i%2==0 && j%2==0)
					if(arr[j]>arr[i])
						swapElements(arr,i,j);	
				if(i%2==1 && j%2==1)
					if(arr[j]<arr[i])
						swapElements(arr,i,j);
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
    }
}