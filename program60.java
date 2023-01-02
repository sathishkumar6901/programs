import java.util.*;
public class program60
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum=0,prev=0;
		for(int i=0;i<n;i++)
		{
			prev=(long)Math.pow(10,i)+prev;
			sum+=prev;
		}
		System.out.println("The sum is: "+sum);
	}
}