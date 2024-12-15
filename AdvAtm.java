import java.util.Scanner;
interface Atm
{   
  abstract public  void cashWithdraw(int amount , int i);
  abstract public  int cashDeposit(int amount, int i);
  abstract public void transferFund(int toAcc , int cash , int fromAcc);
  abstract public void balanceEnquiry(int i);
}


 
class Test implements Atm
{
      static  int  d[][]  = new int[][]{{1,1111,1000},{2,2222,1000},{3,3333,1000},{4,4444,1000},{5,5555,1000}};
     static  String[] name ={"Tomar Tarun Singh","Pradeep Prajapati","Dev Prakash","Gopal Borana","Ayush Kumar"};
      static int AtmAmount = 200;
       
      public void balanceEnquiry( int i)
      {
          System.out.println(d[i][2]);  
       }

      public void transferFund( int toAcc , int cash , int fromAcc)
      {
            boolean flag = false;
             int l;
            for( l=0;l<d.length;l++)
            {
                 int m=0;
                 if(toAcc == d[l][m])
                 {
                     flag = true;
                     break;  
                 }
            }
            if(flag == true)
            {
                 d[fromAcc][2] = d[fromAcc][2] - cash;
                 d[l][2] = d[l][2] + cash; 
                 System.out.println("Transfer Successful");
                 System.out.println("Remaining Balance"+" "+d[fromAcc][2]);  
                System.out.println();
            }
            else
            {
                System.out.println("Cannot found sender Account:");
            }           
      }
      public void cashWithdraw(int amount , int i)
      {
           if(AtmAmount >0 && amount <= AtmAmount)
           {   
              if(amount<=d[i][2])
             {
                  d[i][2] =d[i][2] - amount;  
                 AtmAmount = AtmAmount - amount;
                  System.out.println("Cash debited");   
             } 
              else
             {
                  System.out.println("In sufficient amount in your account:");       
              }
          }
         else
         {
                System.out.println("Atm out of Cash");
         }          
      }
      public int cashDeposit(int amount , int i)
      {
           d[i][2] =d[i][2] + amount;
          AtmAmount = AtmAmount+ amount;
           return  d[i][2];
      }     
}

class Base extends Test
{
      public static void main(String...args) 
      {
            Scanner sc = new Scanner(System.in);
            Base user =new Base();
            System.out.println("To Start press 1");
            System.out.print("Enter: ");
            int c = sc.nextInt();
            System.out.println();
           do
           {             
                 System.out.println("Enter your Pin");
                 int p= sc.nextInt();
                 System.out.println();
                 boolean flag = false;
                 int i;
                outer : for( i=0;i<d.length;i++)
                {
                        int j =1;                    
                        if(p == d[i][j])
                       {
                          flag = true;
                          break outer;  
                       }   
               }
                 if(flag == true)
                {
                    System.out.println("Welcome User:");
                    System.out.println("Name:"+" "+name[i]);
                    System.out.println("Account:"+" "+d[i][0]);
                    int E;
                    
                    do
                   {             
                     System.out.println();
                     System.out.println("1. Cash Withdraw");
                     System.out.println("2. Deposit Cash");
                     System.out.println("3. Balance Enquiry");
                     System.out.println("4. Transfer Fund");
                     System.out.println("5. Exit");
                     System.out.println();
                     System.out.println("Enter your Choice:");
                     int n= sc.nextInt();
                     System.out.println();
                     E=n;
                     switch(n)
                     {
                          case 1:
                          System.out.println("Enter the amount:");
                          int wa =sc.nextInt();
                          user.cashWithdraw(wa , i);
                          System.out.println();
                          break;
            
                          case 2:
                          System.out.println("Enter the amount:");
                          int  da = sc.nextInt();
                          System.out.println("Cash credited");
                          System.out.println("Remaining amount:"+" "+ user.cashDeposit(da , i));
                          System.out.println();
                          break;
            
                          case 3:
                          user.balanceEnquiry(i);
                          System.out.println();
                          break;
                          
                          case 4:
                          System.out.println("Enter Account number:");
                          int toAcc = sc.nextInt();
                          System.out.println("Enter Amount:");
                          int cash = sc.nextInt();
                          System.out.println();
                          user.transferFund(toAcc , cash , i);
                          break;
    
                         default :
                         System.out.println("Thank You");
                        System.out.println();
                        
                    }      
                  }while(E<5);
             System.out.println("For Continue press 1 else 0");
             System.out.print("Enter:");
             c=sc.nextInt();  
             System.out.println();
           }           
           else
          {
                System.out.println("Not valid User:");
          }
        }while(c==1); 
      }
}