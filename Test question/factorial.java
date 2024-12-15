//program to find the factorial of the number
import java.util.*;
class Test
{
  public static void main(String...arg)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int count=1;
    for(int i=5;i>0;i--)
    {
      count =count*i;
     }
     System.out.println(count);
   }
 }