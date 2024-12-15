//program to find max no. in 2d array
import java.util.*;
class Test
{
  public static void main(String...arg)
   {
     Scanner sc =new Scanner(System.in);
     int[][] a=new int[4][];
     for(int i=0;i<4;i++)
     {
          System.out.println("enter the num of element for"+(i+1)+"row");
          a[i]=new int[sc.nextInt()];
          System.out.println("enter element:");
          for(int j=0;j<a[i].length;j++)
          {
               a[i][j]=sc.nextInt();
          }
       }
       int max=0;
       for(int k=0;k<4;k++)
       {
           for(int q=0;q<a[k].length;q++)
           {
                 if(max<a[k][q])
                 {
     	   max=a[k][q];
                  }
            }
        }
           System.out.println("max element is: "max);
    }
}