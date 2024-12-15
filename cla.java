import java.util.Scanner;
class Test
{
   public static void main(String...s)
   {
       Scanner sc=new Scanner(System.in); 
       System.out.println("enter roll number");
       int a=sc.nextInt();

       String d=sc.nextLine();

      System.out.println("enter your name");
      String b=sc.nextLine();

      System.out.println("enter your age");
      int c=sc.nextInt();
      System.out.println(a +" "+b+" "+c);   
   }
}