import java.util.*;
public class program74a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] array1 = new int[n][n];
		int[][] array2 = new int[n][n];
		int[][] result = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				array1[i][j]=sc.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				array2[i][j]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				result[i][j]=0;
				for(int k=0;k<n;k++)
				{
					result[i][j]+=array1[i][k]*array2[k][j];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(result[i][j]+" ");
			System.out.println();
		}
    }
}