import java.util.*;
public class program32
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==0)
		System.out.println(a+" is neither positive nor negative");
		else if(a>0)
		System.out.println(a+" is positive number");
		else
		System.out.println(a+" is negative number");
    }
}