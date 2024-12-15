//program to add integer digit
import java.util.*;
class Test
{
  public static void main(String...adv)
   {
     int sum=0;
     Scanner sc=new Scanner(System.in);
     int  n=sc.nextInt();
       while(n!=0)
        {
           int m=n%10;
            sum=sum+m;
              n=n/10;
          }
        System.out.println(sum);
    }
}
     