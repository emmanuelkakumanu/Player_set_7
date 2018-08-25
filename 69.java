import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		if(n>k)
		{
		System.out.print(a[0]);
		for(int i=1;i<n-k;i++)
		{
			System.out.print(" "+a[i]);
		}
		}
		else
		System.out.print("Error");
		
	}
}
