import java.util.*;
public class program68b
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int sum=Arrays.stream(arr).sum();
		System.out.println("The sum of elements in an array is: "+sum);
    }
}