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
      System.out.println("selection sort"); 
     for(int i=0;i<n-1;i++)
     {
            for(int j=i;j<n-1;j++)
            {
                   if(a[i]>a[j+1])
                   { 
                      int tem=a[i];
                     a[i]=a[j+1];
                     a[j+1]=tem;
                    }
             }
      }
     for(int k=0;k<n;k++)
      {
          System.out.println(a[k]);
       }
  }
}
  
 