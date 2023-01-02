import java.util.*;
public class program86b
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] charArray = new char[n];
		for(int i=0;i<n;i++)
			charArray[i]=sc.next().charAt(0);
		System.out.println(charArray);
    }
} 