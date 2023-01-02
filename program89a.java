import java.util.*;
public class program89a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		StringBuilder sb = new StringBuilder();
		String result[] = new String[s.length()];
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
				sb.append(s.charAt(i));
			else
			{
			result[j++]=sb.toString();
			sb.delete(0,sb.length());
			}
		}
		result[j++]=sb.toString();
		for(int i=0;i<j;i++)
			System.out.println(result[i]);
    }
} 