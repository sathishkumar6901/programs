import java.util.*;
public class program34
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=(n*(n+1))/2;
		System.out.println("The sum of given natural number is: "+sum);
		int max=sum%10;
		sum/=10;
		while(sum>0)
		{
			if(sum%10>max)
				max=sum%10;
			sum/=10;
		}
		System.out.println("The largest digit of the sum is: "+max);
    }
}