import java.util.*;
public class program27
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	} 
}