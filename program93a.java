import java.util.*;
public class program93a
{
	static void charSorting(char[] ch,int n)
	{
		if(n==1)
			return;
		for(int i=0;i<n-1;i++)
		{
			if(ch[i]<ch[i+1])
			{
				char temp = ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=temp;
			}
		}
		charSorting(ch,n-1);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		int n = ch.length;
		charSorting(ch,n);
		System.out.println(String.valueOf(ch));
    }
}