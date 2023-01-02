import java.util.*;
public class program57
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int length = s.length()-1;
		for(int i=0;i<=length;i++)
		{
			for(int j=0;j<=length;j++)
			{
				if(i==j)
					System.out.print(s.charAt(i)+" ");
				else if(i+j==length)
					System.out.print(s.charAt(j)+" ");
				else
					System.out.print("  ");
      }
      System.out.println();
  }
 }
}