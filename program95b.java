import java.util.*;
import java.io.*;
public class program95b
{
	static boolean isEquals(String s1,String s2)
	{
		String s3="";
		for(int i=s1.length()-1;i>=0;i--)
			s3=s3+s1.charAt(i);
		if(s3.equals(s2))
			return true;
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(isEquals(s1,s2))
			System.out.println(s1 +" and "+s2 +" both are palindrome");
		else
			System.out.println(s1 +" and "+s2 +" both are not palindrome");
    }
} 