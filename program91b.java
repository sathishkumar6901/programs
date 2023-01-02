import java.util.*;
public class program91b
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		int n = ch.length;
		for(int i=0;i<n/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[n-1-i];
			ch[n-1-i]=temp;
		}
		System.out.println(String.valueOf(ch));
    }
} 