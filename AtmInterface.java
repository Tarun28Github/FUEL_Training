import java.util.Scanner;
interface Atm
{   
  abstract public  void cashWithdraw(int amount);
  abstract public  int cashDeposit(int amount);
  abstract public void transferFund(int toAcc , int cash , int fromAcc);
  abstract public void balanceEnquiry();
}
 
class Test implements Atm
{
        static int AtmAmount = 200;
        private int amount;
        Test(int amount)
       {
            this.amount = amount;
        }
       public void setAmount(int amount)
        {
            this.amount = amount;
        } 
       public int getAmount()
        {
             return   amount;
        }
       
       static String[] name = new String[]{"Tomar Taurn Singh","Ayush kumar","Dev Prakash","Manjeet Singh","Pradeep Prajapati","Gopal Borana","Himank Janjire","Deepak Chaudhary","Chanchal Baithwal"};
    
      static    int[]  acc = new int[]{1,2,3,4,5,6,7,8,9};

      static int[]  pin = new int[]{1111,2222,3333,4444,5555,6666,7777,8888,9999};

      static    int[]  balance = new int[]{1000,1000,1000,1000,1000,1000,1000,1000,1000};
      public void balanceEnquiry()
      {
          System.out.println(getAmount());  
       }

      public void transferFund( int toAcc , int cash , int fromAcc)
      {
                       
      }
      public void cashWithdraw(int amount)
      {
           if(AtmAmount >0 && amount <= AtmAmount)
           {   
              if(amount<=1000)
             {
                 int  sub = getAmount() - amount;  
                 setAmount(sub);
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

      public int cashDeposit(int amount)
      {
           int sum = getAmount() + amount;
           setAmount(sum);
           return  sum;
      }     
}

class Base extends Test
{
      Base(int amount)
      {
          super(amount);
      }
      public static void main(String...args) 
      {
             Scanner sc = new Scanner(System.in);
        
            System.out.println("Enter your Pin");
            int p= sc.nextInt();
            boolean flag = false;
            int i;
            for( i=0;i<9;i++)
            {
               if(p == pin[i])
               {
                    flag = true;
                    break;  
               }
            }
             if(flag == true)
            {
            
                   System.out.println("Welcome User:");
                   System.out.println("Name:"+" "+name[i]);
                   System.out.println("Account:"+" "+acc[i]);
                   Base user =new Base(balance[i]);
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
                          user.cashWithdraw(wa);
                          System.out.println();
                          break;
            
                          case 2:
                          System.out.println("Enter the amount:");
                          int  da = sc.nextInt();
                          System.out.println("Cash credited");
                          System.out.println("Remaining amount:"+" "+ user.cashDeposit(da));
                          System.out.println();
                          break;
            
                          case 3:
                          user.balanceEnquiry();
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
                        
                    }      
                  }while(E<5);
           }           
           else
          {
                System.out.println("Not valid User:");
          }
      }
}