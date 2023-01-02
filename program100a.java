import java.util.*;
public class program100a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char[] s2 = s1.toCharArray();
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i]>='a' && s2[i]<='z')
				System.out.printf("The ASCII of %s is %d\n",s2[i],97+(s2[i]-'a'));
			else if(s2[i]>='A' && s2[i]<='Z')
				System.out.printf("The ASCII of %s is %d\n",s2[i],65+(s2[i]-'A'));
		}
	}
} 