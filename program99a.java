import java.util.*;
public class program99a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char[] s2 = s1.toCharArray();
		for(int i=0;i<s2.length;i++)
		{
			System.out.printf("The equivalet capital letter of %s is %s\n",s2[i],Character.toUpperCase(s2[i]));
		}
	}
} 