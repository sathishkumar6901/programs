import java.util.*;
public class program53
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			int sum=0,j=i+1;
			while(j<s.length() && s.charAt(j)>='0' && s.charAt(j)<='9')
			{
				sum=sum*10+(s.charAt(j)-'0');
				j++;
			}
			for(int k=0;k<sum;k++)
				System.out.print(s.charAt(i));
			i=j-1;
		}
    }
}