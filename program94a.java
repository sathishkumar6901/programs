import java.util.*;
public class program94a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		s1=s1.replaceAll("\\s","");
		s2=s2.replaceAll("\\s","");
		if(s1.length()==s2.length())
		{
			char[] array1=s1.toLowerCase().toCharArray();
			char[] array2=s2.toLowerCase().toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			boolean result = Arrays.equals(array1,array2);
			if(result)
				System.out.println(s1+" and "+ s2 +" are anagrams");
			else
				System.out.println(s1+" and "+ s2 +" are not anagrams");
		}
		else
			System.out.println(s1+" and "+ s2 +" are not anagrams");
    }
} 