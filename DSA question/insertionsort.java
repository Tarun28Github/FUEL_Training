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
      for(int i=0;i<n-1;i++)
      {
           for(int j=i+1;j>0;j--)
           {
                if(a[j-1]>a[j])
               { 
                    int temp=a[j-1];
                    a[j-1]=a[j];
                     a[j]=temp;
                }
           }
        }
        System.out.println("printing array");
       for(int k=0;k<n;k++)
       {
            System.out.println(a[k]);
        }
   }
}