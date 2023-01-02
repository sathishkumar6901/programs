import java.util.*;
public class program59
{
	static boolean isSubString(String mString,String sString,int i,int j)
	{
		int length1=mString.length();
		int length2=sString.length();
		if(i==length1)
			return false;
		else if(j==length2-1 && mString.charAt(i)==sString.charAt(j))
			return true;
		else if(mString.charAt(i)==sString.charAt(j))
			return isSubString(mString,sString,i+1,j+1);
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String mainString = sc.nextLine();
		String subString = sc.nextLine();
		boolean isTrue = false;
		for(int i=0;i<mainString.length();i++)
		{
			if(isSubString(mainString,subString,i,0))
			{
				isTrue=true;
				System.out.println(i);
				break;
			}
		}
		if(!isTrue)
			System.out.println("-1");
    }
}