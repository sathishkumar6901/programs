import java.util.*;
public class program33
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		if((s>='a' && s<='z') || (s>='A' && s<='Z'))
		System.out.println(s+" is Alphabet");
		else
		System.out.println(s+" is not a Alphabet");
    }
}