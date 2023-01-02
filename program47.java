import java.util.*;
public class program47
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			int k=1;
			for(;k<=i;k++)
				System.out.print(k);
			k-=2;
			for(;k>0;k--)
				System.out.print(k);
			System.out.println();
		}
    }
}