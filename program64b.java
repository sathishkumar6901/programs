import java.util.*;
public class program64b
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		result.addAll(arr);
		for(Integer a:result)
			System.out.print(a+" ");
    }
}