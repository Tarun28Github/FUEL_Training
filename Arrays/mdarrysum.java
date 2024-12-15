// program to add 2d arry
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
      for(int j=0;j<2;j++)
      {
         for(int k=0;k<2;k++)
         {
             c[j][k]=a[j][k]+b[j][k];
          }
      }
      System.out.println("printing array");
    for(int l=0;l<2;l++)
      {
         for(int m=0;m<2;m++)
         {
             System.out.print(c[l][m]);
          }
         System.out.println();
      } 
  
    }
 }

