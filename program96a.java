import java.util.*;
import java.io.*;
public class program96a
{
	static void searchString(String s1,char s2)
	{
		char[] s3=s1.toCharArray();
		for(int i=0;i<s3.length;i++)
		{
			if(s2==s3[i])
			{
				System.out.printf("%s found in %d position in the string %s",s2,i+1,s1);
				return;
			}
		}
		System.out.println("The element is not found");
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char s2 = sc.next().charAt(0);
		searchString(s1,s2);
    }
} 