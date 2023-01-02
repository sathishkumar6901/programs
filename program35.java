import java.util.*;
public class program35
{
	static int factorial(int n)
	{
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact =factorial(n);
		System.out.println("The factorial of a given number is: "+fact);
		int sum=0;
		while(fact>0)
		{
			sum+=fact%10;
			fact/=10;
		}
		System.out.println("The sum of the factorial umber is: "+sum);
		
    }
}