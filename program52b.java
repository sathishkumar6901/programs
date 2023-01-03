import java.util.*;
import java.io.*;
public class program52b
{
	static void reverseWord(String s,int index)
	{
		String result="";
		for(int i=index;i<s.length()+1;i++)
		{
			if(i==s.length())
			{
				System.out.print(result+" ");
				break;
			}
			char ch=s.charAt(i);
			if(ch==' ')
			{
				reverseWord(s,i+1);
				System.out.print(result+" ");
				break;
			}
			else
				result=result+s.charAt(i);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		reverseWord(s,0);
    }
} 