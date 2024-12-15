// program to count duplicate in an array
import java.util.*;
class Test
{
  public static void main(String...arg)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int n=sc.nextInt();
      int[]  a=  new int[n];
      System.out.println("enter array element:");
      for(int i=0;i<n;i++)
      {
           a[i]=sc.nextInt();
      }
      for(int j=0;j<n;j++)
      {
           int count=0;
           for(int k=j;k<n;k++)
           {
                  if(a[j]==a[k])
                  { 
                    count++;     
                   }
            }
           if(count>=2)
          {
                       System.out.println("frequency of "+a[j]+"is: "+count);
           }   
       }
  }
}