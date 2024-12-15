// program to multiply 2D array
import java.util.*;
class Test
{
  public static void main(String...arg)
   {
     Scanner sc =new Scanner(System.in);
     int[][] a=new int[2][2];
     int[][] b=new int[2][2];
      System.out.print("enter first array element");
     for(int i=0;i<2;i++)
     {
          for(int j=0;j<2;j++)
          {
               a[i][j]=sc.nextInt();
          }
       }
   System.out.print("enter second array element");
     for(int o=0;o<2;o++)
     {
          for(int p=0;p<2;p++)
          {
               b[o][p]=sc.nextInt();
          }
       }
      int[][]  c =new int[2][2];
     for(int s=0;s<2;s++)
     {
        for(int t=0;t<2;t++)
        {
           for(int u=0;u<2;u++)
           {
             c[s][t]+=a[s][u]*b[u][t];
            }          
        }   
     }
     System.out.println("printing array");
     for(int l=0;l<2;l++)
      {
         for(int m=0;m<2;m++)
         {
             System.out.print(c[l][m]+" ");
         }
         System.out.println();
      }
   }
}