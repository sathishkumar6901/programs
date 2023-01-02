import java.util.*;
public class program88b
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		int i = 0;
		StringTokenizer string = new StringTokenizer(s);
		String[] array = new String[string.countTokens()];
		while(string.hasMoreTokens())
		{
			array[i++]=string.nextToken();
		}
		for(String a:array)
			System.out.println(a);
    }
} 