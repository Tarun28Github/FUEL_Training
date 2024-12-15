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
      Arrays.sort(a);
      low=a[0];
      high=a[n-1];
       for(int k=low;k<=high;k++)
      {
         add=add+k;   
      }
      System.out.println("missing element is : "+(add-sum));
  }
}