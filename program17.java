import java.util.*;
public class program17
{
	static double calculateRadius(double o_radius,double i_radius)
	{
		double radius1=Math.PI*o_radius*o_radius;
		double radius2=Math.PI*i_radius*i_radius;
		return radius1-radius2;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double outerRadius = sc.nextInt();
		double innerRadius = sc.nextInt();
		System.out.printf("%.2f",calculateRadius(outerRadius,innerRadius));
    }
}