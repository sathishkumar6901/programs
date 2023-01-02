import java.util.*;
public class program96b
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char s2 = sc.next().charAt(0);
		int pos	= s1.indexOf(s2);
		if(pos!=-1)
			System.out.printf("%s found in %d position in the string %s",s2,pos+1,s1);
		else
			System.out.println("The element is not found");
		
	}
} 