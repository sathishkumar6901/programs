import java.util.*;
public class program92a
{
	static void stringSorting(String[] arr,int n)
	{
		if(n==1)
			return;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i].compareTo(arr[i+1])>0)
			{
				String temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		stringSorting(arr,n-1);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		String arr[] = s.split(" ");
		int n = arr.length;
		stringSorting(arr,n);
		for(String a:arr)
			System.out.println(a);
    }
}