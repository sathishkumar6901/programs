import java.util.*;
public class program71a
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		if(n<2)
			System.out.println("There is no 2nd large number");
		else
			System.out.println("The 2nd largest number is: "+arr[1]);
    }
}