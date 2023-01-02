import java.util.*;
public class program15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		int height = sc.nextInt();
		double area = 2*Math.PI*(radius*height);
		System.out.printf("%.4f",area);
		
    }
}