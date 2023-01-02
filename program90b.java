import java.util.*;
public class program90b
{
	static void swapString(String[] arr,int i,int j)
	{
		String temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static int checkString(String[] s,int i,int j,int index)
	{
		if(index==s[i].length() || s[i].charAt(index)>s[j].charAt(index))
			return 1;
		else if(index==s[j].length() || s[i].charAt(index)<s[j].charAt(index))
			return -1;
		else 
			return(checkString(s,i,j,index+1));
			
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		String arr[] = s.split(" ");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].charAt(0)>arr[j].charAt(0))
				{
					swapString(arr,i,j);
				}
				if(arr[i].charAt(0)==arr[j].charAt(0))
				{
					int check = checkString(arr,i,j,1);
					if(check>0)
						swapString(arr,i,j);
					else if(check<0)
						swapString(arr,j,i);
				}
			}
		}
		for(String a:arr)
			System.out.println(a);
    }
} 