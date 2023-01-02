import java.util.*;
public class program19
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = 28;
		a+=a++ + ++a + --a + a--;
		System.out.println(a);
	}
}