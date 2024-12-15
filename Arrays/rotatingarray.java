//programe to rotate the 1d array element
import java.util.*;
class Test
{
    public static void main(String...args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        System.out.println("enter array element");
        int[] a=new int[n];
        int[]  b=new int[n];
        for(int i=0;i<n;i++)
        {
              a[i]=sc.nextInt();
         }
         System.out.println("enter rotate value");
         int r=sc.nextInt();
         System.out.println("new array");
         for(int j=0;j<n;j++)
         {
              if(j<r)
              {
                   b[j]=a[(r-1)+j];
               }
               else
               {
                     b[j]=a[j-r];
                }
          }
          for(int k=0;k<n;k++)
          {
                   System.out.println(b[k]);
           }
     }
}        