import java.util.*;
public class program81a
{
	static boolean isEqualMatrix(int n,int[][] arr1,int[][] arr2)
	{
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				if(arr1[i][j]!=arr2[i][j])
					return false;
		return true;
	}
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
		if(isEqualMatrix(n,array1,array2))
			System.out.println("Both the matrix are equal");
		else
			System.out.println("Both the matrix are not equal");
    }
}