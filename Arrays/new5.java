//program to make a calculater 
import java.util.*;
class Test
{
  public static  void main(String...arg)
  {
     
     System.out.println("1.Add");
     System.out.println("2.subtract");
     System.out.println("3.Multiply");
     System.out.println("4.Divide");
     System.out.println("5.Exit");
     Scanner sc=new Scanner(System.in);
       int choice;     
    do{

      System.out.println("enter the value");
      int a=sc.nextInt();
      int b=sc.nextInt();
      
     System.out.println("Enter your choice");
     choice=sc.nextInt();
     switch(choice)
     {
        case 1:
          {
           int sum=a+b;
           System.out.println(sum);
            break;
          } 
        case 2:
          {
           int sub=a-b;
           System.out.println(sub);
            break;
          }
        case 3:
          {
           int multi=a*b;
           System.out.println(multi);
            break;
          }
        case 4:
          {
           float div=a/b;
           System.out.println(div);
            break;
          }
         default:
           {
               System.out.println("Exit");
            }
       }
     }while(choice!=5);
    }
}     
     