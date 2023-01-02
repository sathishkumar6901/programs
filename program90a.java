import java.util.*;
public class program90a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		String arr[] = s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(String a:arr)
			System.out.println(a);
    }
}