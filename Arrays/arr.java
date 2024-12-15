// program to find out the largest element in the array
import java.util.*;
class Test
{
 public static void main(String...arg)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter array element"); 
  int max=0;
  int[] a= new int[5];
   for(int i=0; i<5;i++)
    {
       a[i] = sc.nextInt();
       if(a[i]> max)
       {
         max=a[i];       
        }
     }
   
    for(int i =0;i<5;i++)
    {
     System.out.print(a[i]);
    }
    System.out.println("largest element in array is: "+max);
  }
}