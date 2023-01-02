import java.util.*;
public class program31
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int discriminant = b*b-4*a*c;
		double root1,root2;
		if(discriminant>0)
		{
			root1 = (-b + Math.sqrt(discriminant))/(2*a);
			root2 = (-b - Math.sqrt(discriminant))/(2*a);
			System.out.printf("root1=%.2f and root2=%.2f",root1,root2);
		}
		else if(discriminant==0)
		{
			root1 = -b/(2*a);
			System.out.printf("root1=%.2f and root2=%.2f",root1,root1);
		}
		else
		{
			double realPart = -b/(2*a);
			double imaPart = Math.sqrt(-discriminant)/(2*a);
			System.out.printf("root1=%.2f+%.2fi and root2=%.2f-%.2fi",realPart,imaPart,realPart,imaPart);
		}
    }
}