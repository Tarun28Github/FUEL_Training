//program to find nonduplicate number
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
     System.out.println("having no duplicate is:");
      for(int j=0;j<n;j++)
      {
          int flag=0;
           for(int k=0;k<n;k++)
           {
                  if(k!=j)
                  { 
                       if(a[j]==a[k])
                       {
                          flag=1;
                          break; 
                        } 
                  }
            }
          if(flag==0)
          {
                  System.out.println(a[j]);
           }
       }
  }
}