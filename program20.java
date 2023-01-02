import java.util.*;
public class program20
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x= 10;
		x=x++ * 2 + 3 * --x;
		System.out.println(x);
	}
}