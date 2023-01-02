import java.util.*;
public class program26
{
	long returnLong()
	{
		return 10L;
	}
	public static void main(String args[])
	{
		//long keyword used to store large number value
		program26 p = new program26();
		long min = -9223372036854775808L;
		long max = 9223372036854775807L;
		System.out.println("minimum value of long keywordis: "+min);
		System.out.println("maximum value of long keywordis: "+max);
		//long keyword used to return value through function/method
		System.out.println("return value is: "+p.returnLong());
		
	} 
}