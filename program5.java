import java.util.*;
public class program5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        for(int i=letter-64;i>=0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(i+64));
            }
            System.out.println();
        }       
    }
}
