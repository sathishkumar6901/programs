import java.util.*;
public class program65b
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] freq = new int[n];
		int visited = -1;
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited)
				freq[i]=count;
		}
		for(int i=0;i<freq.length;i++)
			if(freq[i]!=visited)
				System.out.printf("%d repeated %d times\n",arr[i],freq[i]);
    }
}