import java.util.*;
public class program7
{
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String s = sc.nextLine();
  int length = s.length()-1;
  for(int i=0;i<=length;i++)
  {
      for(int j=0;j<=length;j++)
      {
          if(i==j || i+j == length)
          System.out.print(s.charAt(i)+" ");
          else
          System.out.print("  ");
      }
      System.out.println();
  }
 }
}