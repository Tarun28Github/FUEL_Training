import java.util.*;
class Test
{
  public static void main(String...arg)
   {
     Scanner sc =new Scanner(System.in);
     System.out.println("enter array size");
      int n=sc.nextInt();
     int[][] a=new int[n][n];
      System.out.println("enter first array element");
     for(int i=0;i<n;i++)
     {
          for(int j=0;j<n;j++)
          {
               a[i][j]=sc.nextInt();
          }
      }
      System.out.println("printing array transpose");
     for(int l=0;l<n;l++)
      {
         for(int m=0;m<n;m++)
         {
             System.out.print(a[m][l]);
         }
         System.out.println();
      }
   }
}
 