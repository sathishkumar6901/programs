import java.util.*;
public class program100b
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char[] s2 = s1.toCharArray();
		for(int i=0;i<s2.length;i++)
		{
			System.out.printf("The ASCII of %s is %d\n",s2[i],(int)s2[i]);
		}
	}
} 