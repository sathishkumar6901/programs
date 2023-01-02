import java.util.*;
public class program84a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int count1=0,count2=0;
		for(int a:arr)
		{
			if(a%2==0)
				count1++;
			else
				count2++;
		}
		System.out.println("The frequency of odd numbers: "+count2);
		System.out.println("The frequency of even numbers: "+count1);
    }
} 