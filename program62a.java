import java.util.*;
public class program62a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.print("Elements presents on the even position: ");
		for(int i=0;i<n;i++)
			if(i%2==0)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.print("Elements presents on the odd position: ");
		for(int i=0;i<n;i++)
			if(i%2!=0)
			System.out.print(arr[i]+" ");
    }
}