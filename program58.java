import java.util.*;
public class program58
{
	static void printStar(int i)
	{
		for(int j=0;j<i;j++)
			System.out.print("*");
	}
	static void printUnderscore(int i)
	{
		for(int j=0;j<i;j++)
			System.out.print("_");
	}	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n;i>0;i--) 
		{
			printStar(i);
			printUnderscore(n-i);
			printUnderscore(n-i);
			printStar(i);
			System.out.println();
		}
		for(int i=2;i<=n;i++) 
		{
			printStar(i);
			printUnderscore(n-i);
			printUnderscore(n-i);
			printStar(i);
			System.out.println();
		}
    }
}