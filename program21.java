import java.util.*;
public class program21
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int y= 10;
		int z=(++y * (y++ + 5));
		System.out.println(z);
	}
}