import java.util.*;
public class program2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char letter = sc.next().charAt(0);
        for(int i=letter-64;i<=26;i++)
        {
            System.out.print((char)(i+64));
        }
        
    }
}
