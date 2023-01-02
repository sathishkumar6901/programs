import java.util.*;
public class program95a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		StringBuilder sb = new StringBuilder(s2);
		sb.reverse();
		if(s1.equals(sb.toString()))
			System.out.println(s1 +" and "+s2 +" both are palindrome");
		else
			System.out.println(s1 +" and "+s2 +" both are not palindrome");
    }
} 