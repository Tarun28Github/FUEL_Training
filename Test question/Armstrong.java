//program to find the number is armstrong
import java.util.*;
class Test
{
  public static void main(String...arf)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0,m=n,sum=0;
    while(m!=0)
    {
       m=m/10;
       count++;
     }      
    System.out.println(count);
     while(n!=0)
     {
         int k=n%10;
          n=n/10;
        sum=sum+(int)Math.pow(k,count);
      }
     System.out.println(sum);
    if(sum==n)
    {
       System.out.println("Number is armstrong");
     }
     else
      {
         System.out.println("Number is not armstrong");
        }
    }
}
 