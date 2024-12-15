//program to find out a number is a fibonacci 
import java.util.*;
class Test
{
 public static void main(String...arg)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number");
   int n=sc.nextInt();
   int sum=0,a=0;
    int b=1;
   System.out.print(a+" "+b+" ");
  for(int i=0;i<n-2;i++)
   {
     sum=a+b;
     System.out.print(sum+" ");
     a=b;
     b=sum;
   }
  }
 }   
 
      
  