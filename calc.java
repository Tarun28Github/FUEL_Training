import java.util.Scanner;
class Test
{
  public static void main(String...sresf)
  {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the variable");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int n;
     do
    {
       System.out.println("enter your choice");
        n=sc.nextInt();
       switch(n)
       {
            case 1:  System.out.println(a+b);
             break;
       
           case 2: System.out.println(a-b);
            break;
           
           case 3: System.out.println(a/b);
             break;
          
           case 4: System.out.println(a*b);
           break;
          
          default: System.out.println("Bye Bye");
         }
       }while(n!=5);
     }
  } 