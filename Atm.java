import java.util.Scanner;
abstract class Atm
{   
   private int amount;
   Atm(int amount)
   {
         this.amount = amount;
    }
   public void setAmount(int amount)
   {
         this.amount = amount;
    }
    public int getAmount()
    {
         return amount;     
    }
   abstract public int cashWithdraw(int amount);
   abstract public int cashDeposit(int amount);
   abstract public void balanceEnquiry();
}
class Test extends Atm
{
   static String[] name = new String[]{"Tomar Taurn Singh","Ayush kumar","Dev Prakash","Manjeet Singh","Pradeep Prajapati","Gopal Borana","Himank Janjire","Deepak Chaudhary","Chanchal Baithwal"};
    
   static    int[]  acc = new int[]{1,2,3,4,5,6,7,8,9};

   static int[]  pin = new int[]{1111,2222,3333,4444,5555,6666,7777,8888,9999};

  static    int[]  balance = new int[]{1000,1000,1000,1000,1000,1000,1000,1000,1000};

 Test(int amount)
  { 
     super(amount);
   }
public  int cashWithdraw(int amount)
   {
       if(amount<1000)
       {
         int  sub = getAmount() - amount;
            setAmount(sub);
          return  sub;  
        } 
       else
       {
            System.out.println("In sufficient amount:");
            return 0;
        }         
   }
  public void balanceEnquiry()
   {
        System.out.println(getAmount());  
   }
  public int cashDeposit( int amount)
   {
       int sum = getAmount() + amount;
       setAmount(sum);
        return  sum;
   }
   public static void main(String...rdja)
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
             Test user =new Test(balance[i]);
             int E;
         
      do
      {             
               System.out.println();
              System.out.println("1. Cash Withdraw");
              System.out.println("2. Deposit Cash");
              System.out.println("3. Balance Enquiry");
              System.out.println("4. Exit");
             System.out.println();
              System.out.println("Enter your Choice:");
             System.out.println();
              int n= sc.nextInt();
             E=n;
               switch(n)
             {
                 case 1:
                      System.out.println("Enter the amount:");
                      int wa =sc.nextInt();
                     System.out.println("Cash debited:");
                      System.out.println("Remaining amount:"+" "+user.cashWithdraw(wa));
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
     
                 default :
                       System.out.println("Thank You");
                        
              }      
         }while(E!=4);
       }
       else
      {
         System.out.println("Not valid User:");
      }                                
  }
} 