import java.util.*;
class Test
{
  public static void main(String...adsg)
  {
    System.out.println("1. for left shift ");
   System.out.println("2. for right shift");
    Scanner sc=new Scanner(System.in);
   int flag=sc.nextInt();
    System.out.println("Enter array size");
    int x=sc.nextInt();
    System.out.println("Enter array element");
     
    int[]  a= new int[x] ;
     for(int k=0;k<x;k++)
     {
        a[k] =sc.nextInt();
      }
    int[]  b= new int[x];
   System.out.println("enter shift value");
   int n=sc.nextInt();
  while(n>x)
  {
   if(n>x)
   {
       n=n-x;
    }
  }
      
  if(flag==2)
  {
      int count=0;
     for(int j=0;j<n;j++)
     {
           b[j]=a[x-n+j];
           count++; 
     }
     for(int i=n;i<x;i++)
     {
       b[i]=a[i-count];          
     }
   
    for(int i=0;i<5;i++)
    {
       System.out.println(b[i]);
    }
  }
  else
  {
     int count=0;
       for(int i=n;i<x;i++)
     {
        b[count]=a[i];
        count++;          
     }
     for(int j=0;j<n;j++)
     {
           b[count]=a[j];
           count++; 
     }
   
   
    for(int i=0;i<5;i++)
    {
       System.out.println(b[i]);
    }
   }
  
}
}