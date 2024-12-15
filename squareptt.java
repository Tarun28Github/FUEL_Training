import java.util.*;
class Test
{
   public static void main(String...arg)
   {
          Scanner sc= new Scanner(System.in);
          System.out.println("enter the size");
          int n=sc.nextInt();
          int k=n*2-1;
          int t=k-1;
          int[][] a = new int[k][k];
          int[][] b = new int[k][k];
          for(int i=0;i<k;i++)
          {
                for(int j=0;j<k;j++)
                {
                      if(i==j)
                      {
                          if(i<n)
                          {
                              System.out.print(n-i);
                           }
                          else if(i>=n)
                           {
                              System.out.print(i-n+2);
                            }
                       }
                      else if(i<j)
                       {
                                 System.out.print(0);
                        }
                      else if(i>j)
                        {
                               if(i<=4)
                               {
                                   System.out.print(n-i);
                                   if(i<=t-j)
                                   {
                                          System.out.print(i-1);
                                   }
                                }
                         }
                 }
              System.out.println();    
           }
     }
}