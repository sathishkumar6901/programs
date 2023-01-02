import java.util.*;
public class program1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Multiplication Table");
        for(int i=1;i<=10;i++)
        {
            String s=String.format("%d x %d = %d", i, number, i*number);
            System.out.println(s);
        }
        System.out.println("Subtraction Table");
        for(int i=number;i<=10;i++)
        {
            String s=String.format("%d - %d = %d", i, number, i-number);
            System.out.println(s);
        }
    }
}
