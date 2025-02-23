import java.util.*;
public class WrapperBoxingApp
{
	public static void main(String args[])
	{
		Double d = 5.4;
		int b = d.intValue(); //convert double into integer
		System.out.printf("D = %f\tB=%d\n",d,b);
		float f=d.floatValue(); // convert double to float
		System.out.printf("D = %f\tF=%f\n  ",d,f);
		long l=d.longValue(); // convert double to long
		System.out.printf("D=%f\tL=%d\n",d,l);
	}
}
