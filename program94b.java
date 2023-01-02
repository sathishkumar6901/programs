import java.util.*;
public class program94b
{
	static boolean isAnagram(String s1,String s2)
	{
		int[] count=new int[256];
		if(s1.length()!=s2.length())
			return false;
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			count[char1[i]]++;
			count[char2[i]]--;
		}
		for(int i=0;i<256;i++)
			if(count[i]!=0)
				return false;
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(isAnagram(s1,s2))
			System.out.println(s1+" and "+ s2 +" are anagrams");
		else
			System.out.println(s1+" and "+ s2 +" are not anagrams");
    }
} 