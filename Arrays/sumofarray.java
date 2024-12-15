import java.util.*;
class Test
{
  public static void main(String...arg)
  {
      Scanner sc=new Scanner(System.in);
      int sum=0;
      System.out.println("Enter the size of array:");
      int n=sc.nextInt();
      int[]  a=  new int[n];
      System.out.println("enter array element:");
      for(int i=0;i<n;i++)
      {
           a[i]=sc.nextInt();
            sum=sum+a[i];
      }
      System.out.println("sum of array: "+sum);
   }
}
