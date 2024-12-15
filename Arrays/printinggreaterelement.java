//program to print greater element
import java.util.*;
class Test
{
  public static void main(String...arg)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array");
      int n =sc.nextInt();
      int[] a= new int[n];
      int max=0;
      System.out.println("enter value");
      for(int i=0;i<n;i++)
      {
          a[i]=sc.nextInt();  
      }
      System.out.println("greater element are:");
      for(int i=0;i<n;i++)
      {
          int m=0;
          if(i<n-1)
          {
               for(int j=i+1;j<n;j++)
               {
                    if(m<a[j])
                    {  
                          m=a[j];
                          a[i]=m;
                     }
               }
          }
          else
          {
              a[i]=max;
          }
      }
      System.out.println("Printing new array:");
      for(int j=0;j<n;j++)
      {
           System.out.println(a[j]);
      }
  }
} 
   