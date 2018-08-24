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
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		
		for(int i=0;i<n;i++)
		b[i]=s.nextInt();
		int t=0;
		
		int c[]=new int[n];int k=0,f=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==b[j] && a[i]!=t)
				{
					c[k++]=a[i];
					t=a[i];
					f=1;
				}
			}
		}
		if(f==1)
		{
			System.out.print(c[0]);
			for(int i=1;i<k;i++)
			System.out.print(" "+c[i]);
		}
	}
}
