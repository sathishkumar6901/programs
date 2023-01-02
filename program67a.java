import java.util.*;
public class program67a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		HashSet<Integer> result = new HashSet<Integer>();
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		for(Integer a:arr)
			if(!result.add(a))
				System.out.print(a+" ");
    }
}