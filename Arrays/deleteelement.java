//program to delete element from array
import java.util.*;
class Test
{
  public static void main(String...arg)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int n=sc.nextInt();
      int[]  a=  new int[n];
      System.out.println("enter array element:");
      for(int i=0;i<n;i++)
      {
           a[i]=sc.nextInt();
      }

      for(int i=1;i<n;i++)
      {
           if(a[i]==a[i-1])
           {
                for(int k=i;k<n-1;k++)
                {
                      a[k]=a[k+1];
                }
                 n--;        
           }   
      }
      System.out.println("new array");
      for(int j=0;j<n;j++)
      {
           System.out.println(a[j]);
      }
  }
}