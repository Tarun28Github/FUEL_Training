import java.util.*;
class Test
{
  public static void main(String...argas)
  {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
       int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
           for(int j=0;j<a;j++)
           {
               if(i>0 && i<a-1 && j>0 && j<a-1)
               {
                  System.out.print(" ");
               }
               else
               {
                  System.out.print(j+1);
                }
            }
           System.out.println();
          }
      }
   }
                