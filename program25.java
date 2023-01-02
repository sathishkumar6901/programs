import java.util.*;
public class program25
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int divisor = sc.nextInt();
		System.out.println("Quotient: " + number/divisor);
		System.out.println("Remainder: "+ number%divisor);
	} 
}