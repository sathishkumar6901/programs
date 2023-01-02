import java.util.*;
public class program64a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] result = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			result[i]=arr[i];
		for(int a:result)
			System.out.print(a+" ");
    }
}