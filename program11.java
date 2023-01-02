import java.util.*;
public class program11
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int temp=arr[i][0];
			for(int j=1;j<n;j++)
				arr[i][j-1]=arr[i][j];
			arr[i][n-1]=temp;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
