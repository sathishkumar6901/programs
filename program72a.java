import java.util.*;
public class program72a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		HashSet<Integer> result = new HashSet<Integer>();
		for(int i=0;i<n;i++)
			arr.add(sc.nextInt());
		result.addAll(arr);
		System.out.println(result);
    }
}