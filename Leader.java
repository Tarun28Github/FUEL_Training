import java.util.*;
class Test
{
  public static void main(String...adr)
  {
    Scanner sc=new Scanner(System.in);
    int[] a = new int[5];
    System.out.println("Enter array element");
    for(int i=0;i<5;i++)
    {
       a[i]=sc.nextInt();
     }
     for(int i=0;i<5;i++)
     {
       for(int j=i+1;j<5;j++)
       {
          if(a[j]>=a[i])  
         {
            break;
         }
         else
         {
             System.out.print(a[i]);
           }
         
       }
     }
  }
}  