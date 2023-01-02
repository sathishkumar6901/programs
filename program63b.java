import java.util.*;
public class program63b
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int min = Collections.min(Arrays.asList(arr));
		int max = Collections.max(Arrays.asList(arr));
		System.out.println("The minimum element is: "+min);
		System.out.println("The maximum element is: "+max);
		
	}
}