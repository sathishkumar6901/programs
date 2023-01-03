import java.util.*;
import java.io.*;
public class program52a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//reverseWord(s);
		String[] result=s.split(" ");
		for(int i=result.length-1;i>=0;i--)
			System.out.print(result[i]+" ");
    }
} 