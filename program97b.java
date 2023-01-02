import java.util.*;
public class program97b
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char s2 = sc.next().charAt(0);
		char[] s3 = s1.toCharArray();
		Arrays.sort(s3);
		int pos=-1;
		int start=0,end=s3.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(s3[mid]==s2)
			{
				pos=mid;
				break;
			}
			else if(s3[mid]>s2)
				end=mid-1;
			else
				start=mid+1;
		}
		if(pos!=-1)
			System.out.printf("%s found in %d position in the string %s",s2,pos+1,s1);
		else
			System.out.println("The element is not found");
		
		
	}
} 