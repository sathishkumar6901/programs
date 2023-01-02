import java.util.*;
public class program29
{
	public static void main(String args[])
	{
		ArrayList<Character> a=new ArrayList<Character>();
		a.add('a');
		a.add('e');
		a.add('i');
		a.add('o');
		a.add('u');
		Scanner sc = new Scanner(System.in);
		char s=sc.next().charAt(0);
		if(a.contains(Character.toLowerCase(s)))
		System.out.println("The given character is Vowel");
		else
		System.out.println("The given character is Consonant");
	} 
}