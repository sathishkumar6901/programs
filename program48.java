import java.util.*;
public class program48
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<i;j++)
				System.out.print(" ");
			int k=i;
			for(;k<=n;k++)
				System.out.print(k);
			k-=2;
			for(;k>=i;k--)
				System.out.print(k);
			System.out.println();
		}
    }
}