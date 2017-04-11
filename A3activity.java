import java.util.*;
public class A3activity
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
     	int n=sc.nextInt();
     	int[] s=new int[n];
     	int[] f=new int[n];
     	int[] a=new int[n];
     	for(int i=0;i<n;i++)
     	{
     		s[i]=sc.nextInt();
     	}
     	for(int i=0;i<n;i++)
     	{
     		f[i]=sc.nextInt();
     	}
     	for(int i=0;i<n;i++)
     	{
     		a[i]=i+1;
        }
     	int swap,swap1,swap2;
     	for (int i=0;i<n-1;i++)
        {
             for (int j=0;j<n-i-1;j++)
             {
                  if (f[j]>f[j+1]) 
                  {
                      swap = f[j];
                      f[j] = f[j+1];
                      f[j+1] = swap;

                      swap1 = s[j];
                      s[j] = s[j+1];
                      s[j+1] = swap1;

                      swap2 = a[j];
                      a[j] = a[j+1];
                      a[j+1] = swap2;
                  }
             }
        }
      int i=0;
      System.out.print(a[0]+"\t");
      	for(int j=1;j<n;j++)
      	{
      		if(s[j]>=f[i])
      			System.out.print(a[j]);
      		i=j;
      	}
	}
}