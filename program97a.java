import java.util.*;
public class program97a
{
	static int searchChar(char[] s1,char s2)
	{
		int start=0,end=s1.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(s1[mid]==s2)
				return mid;
			else if(s1[mid]>s2)
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char s2 = sc.next().charAt(0);
		char[] s3 = s1.toCharArray();
		Arrays.sort(s3);
		int pos=searchChar(s3,s2);
		if(pos!=-1)
			System.out.printf("%s found in %d position in the string %s",s2,pos+1,s1);
		else
			System.out.println("The element is not found");
		
		
	}
} 