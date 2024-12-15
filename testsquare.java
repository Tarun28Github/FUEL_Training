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
          for(int i=0;i<k;i++)
          {
                for(int j=0;j<k;j++)
                {
                      if(i==j)
                      {
                          if(i<n)
                          {
                              a[i][j]=n-i;
                           }
                          else if(i>=n)
                           {
                              a[i][j]=i-n+2;
                            }
                       }
                       if(i<j)
                       {
                             if(i>=0)
                             {
                                   a[i][j]=n-i;
                              }
                              if(j>=t-i)
                              {
                                  a[i][j]=j-1;
                              }
                        }
                        if(i>j)
                        {
                                if(j>=0)
                                {
                                     a[i][j]=n-j;
                                 }
                                 if(i>=t-j)
                                 {
                                     a[i][j]=i-1;      
                                  }      
                         }
                 }       
           }
           for(int x=0;x<k;x++)
           {
                for(int y=0;y<k;y++)
                {
                     System.out.print(a[x][y]);
                 }
                System.out.println();
            }
    }
}
