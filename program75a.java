import java.util.*;
public class program75a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.print("Odd numbers: ");
		for(int a:arr)
			if(a%2!=0)
				System.out.print(a+" ");
		System.out.println();
		System.out.print("Even numbers: ");
		for(int a:arr)
			if(a%2==0)
				System.out.print(a+" ");
    }
}