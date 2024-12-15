// program to find elemet in array
import java.util.*;
class Base
{
 public static void main(String...arg)
  {
    Scanner sc = new Scanner(System.in);
   System.out.println("enter array size");
   int N=sc.nextInt();
    int[] a= new int[N];
    int flag=0;
     int pos=0;
   System.out.println("enter the value");
   for(int i=0;i<N;i++)
  {
      a[i]=sc.nextInt();
   }
   System.out.println("find value:");
   int f=sc.nextInt();
    for(int i=0;i<N;i++)
    {
         if(f==a[i])
          {
             flag=1;
             pos=i+1;
             break;
          }
     }
     if(flag==1)
      {
          System.out.println("Element found at postition:"+pos);
       }
       else 
       { 
            System.out.println("Element not found");    
        } 
    }
}