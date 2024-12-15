import java.util.*;
class Test
{
   public static void main(String...arg)
   {
       Scanner sc =new Scanner(System.in);
       int[] a= new int[5];
       for(int i=0; i<5;i++)
       {
          a[i]= sc.nextInt();
       }
       for(int i=0;i<5-1;i++)
       {
           for(int j=i;j<5;j++)
          {
              if(a[i]>a[j])
             {
                int temp= a[i];
                 a[i]= a[j];  
                 a[j]= temp;
             }
          }
       }
      System.out.println("sorted array:");
       for(int k=0;k<5;k++)
      {
           System.out.println(a[k]);
       }
    }
 }  