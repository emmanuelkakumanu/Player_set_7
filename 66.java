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
		for(int i=0;i<n;i++)
		{
			int cnt=0;
			for(int j=i;j<n;j++)
			{
				if(a[i]==a[j])
				cnt++;
			}
			if(cnt==k)
			System.out.print(a[i]);
		}
		
	}
}
