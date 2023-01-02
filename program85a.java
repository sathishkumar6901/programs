import java.util.*;
public class program85a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		System.out.println("Sum of each row:");
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<n;j++)
			{
				sum+=arr[i][j];
			}
			System.out.printf("sum of the row%d is: %d\n",i+1,sum);
		}
		System.out.println("Sum of each column:");
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<n;j++)
			{
				sum+=arr[j][i];
			}
			System.out.printf("sum of the column%d is: %d\n",i+1,sum);
		}
    }
}