import java.util.*;
public class program23
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = 5;
		int x1=++x - x++ + --x;
		System.out.println(x1);
	}
}