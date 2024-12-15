import java.util.*;
class Test
{
   public static void main(String...arg)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of array:");
       int n=sc.nextInt();
       int[] a=new int[n];
       System.out.println("enter array element:");
       for(int i=0;i<n;i++)
       {
             a[i]=sc.nextInt();
        }  
        System.out.println("performing zig zag motion:");
        for(int i=0;i<n-1;i++)
        {
             if(i%2==0)
             {
                  if(a[i]>a[i+1])
                  {
                       int tem=a[i];
                     a[i]=a[i+1];
                     a[i+1]=tem;
                   }
              }
              else
              {
                    if(a[i]<a[i+1])
                    {
                      int tem=a[i];
                     a[i]=a[i+1];
                     a[i+1]=tem;
                     }   
               }
         }
         System.out.println("printing array:");
         for(int k=0;k<n;k++)
         {
              System.out.println(a[k]);
          }  
      }
   }
      