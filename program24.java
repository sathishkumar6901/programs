import java.util.*;
public class program24
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		if((s>='a' && s<='z') || (s>='A' && s<='Z'))
			System.out.println((int)s);
	} 
}