import java.util.*;
public class program65a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		LinkedHashMap<Integer,Integer> result = new LinkedHashMap<Integer,Integer>();
		ArrayList<Integer> visited = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j] && !visited.contains(arr[i]))
					count++;
			}
			if(!visited.contains(arr[i]))
			{
				result.put(arr[i],count);
				visited.add(arr[i]);
			}
		}
		for(Map.Entry<Integer,Integer> e:result.entrySet())
		{
			System.out.printf("%d repeated %d times\n",e.getKey(),e.getValue());
		}
    }
}