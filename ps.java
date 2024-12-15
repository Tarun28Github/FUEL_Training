import java.util.*;
class Test
{
  public static void main(String...args)
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=n*2-1;
     int m=k-1;
     for(int i=0;i<k;i++)
     {
        for(int j=0;j<k;j++)
        {
           if(i==j)
           {
              if(i<n)
              {
                 System.out.print(n-i+" ");
               }
               else
               {
                 System.out.print(i-n+2+" ");
                }
            }
            if(i>j)
            {
               if( i<m-j)
               {
                  System.out.print(n-j+" ");   
               }
                else
                {
                    System.out.print(i+2-n+" ");
                 }
             }
             if(i<j)
             {
               if(j<m-i)
               {
                  System.out.print(n-i+" ");
                }
                else
                {
                   System.out.print(j+2-n+" ");    
                }
             }
         }
        System.out.println(" ");
      }
   }
}      