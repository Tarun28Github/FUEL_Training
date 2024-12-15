//program to find out the missing element in array
import java.util.*;
class Test
{
  public static void main(String...arg)
  {
      int low=100,high=0,sum=0,add=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int n=sc.nextInt();
      int[]  a=  new int[n];
      System.out.println("enter array element:");
      for(int i=0;i<n;i++)
      {
           a[i]=sc.nextInt();
           sum=sum+a[i];
      }
      for(int i=0;i<n;i++)
      {
          if(low>=a[i])
          {
             low=a[i];       
           }
           if(high<=a[i])
          {
               high=a[i];
           }
       }
       for(int k=low;k<=high;k++)
      {
         add=add+k;   
      }
      System.out.println("missing element is : "+(add-sum));
  }
}