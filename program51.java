import java.util.*;
public class program51
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum=0;
		while(n>0)
		{
			sum=(sum*10)+n%10;
			n/=10;
		}
		System.out.println("The reverse of a number is: "+sum);
    }
}