//program to reverse integer
import java.util.*;
class Base
{
   public static void main(String...asdfj)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=n;
     int count=-1;
     while(k!=0)
      {
        k=k/10;
        count++;
       }
      int m=(int)Math.pow(10,count);
      int sum=0;
     while(n!=0)
      {
       sum=sum+m*(n%10);
        n=n/10;
        m=m/10;
        System.out.println(sum);
       } 
       System.out.println(sum);
    }
}
                