import java.util.*;
public class program56
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0,row=0,count=1;;
		while(sum<=n)
		{
			sum+=count;
			row++;
			count++;
		}
		row--;
		int no=1;
		for(int i=row;i>0;i--)
		{
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int k=i;k<=row;k++)
				System.out.print(no++ +" ");
			System.out.println();
		}
    }
	
}