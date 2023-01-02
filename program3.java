import java.util.*;
public class program3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long number = sc.nextLong();
        long temp=number;
        long sum=0;
        while(temp>0)
        {
            sum=sum*10+temp%10;
            temp/=10;
        }
        System.out.println(number-sum);
    }
}
