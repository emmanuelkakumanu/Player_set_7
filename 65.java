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
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int f=0,j=0;
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
			if(a[i]<n)
			{
			c[j++]=a[i];f=1;
			}
		}
		if(f==1)
		{
			System.out.print(c[0]);
			for(int i=1;i<j;i++)
			System.out.print(" "+c[i]);
		}
	}
}
