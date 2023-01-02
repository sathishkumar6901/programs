import java.util.*;
public class program67b
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			int j=i+1;
			while(j<n && arr[i]==arr[j])
				j++;
			if(j!=i+1)
				a.add(arr[i]);
			i=j-1;
		}
		if(a.size()>0)
			System.out.println("The duplicate elements are: "+a);
		else
			System.out.println("There is no duplicate elements in an array");
    }
}