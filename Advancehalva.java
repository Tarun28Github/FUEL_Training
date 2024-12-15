import java.util.Scanner;
class Test
{ 
  public static void main(String...fkaj)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the dimension:");
     int n=sc.nextInt();
     int count=1;
     if(n%2==0)
     {
          for(int i=n;i>=1;i--) 
          {
             int trace=count;
             for(int j=n;j>=i;j--)
             {
                 System.out.print(trace+" ");
          
                 if(j%2==0)//even
                {
                  trace = trace +(i*2-1);     
                }
                else
                {
                    trace = trace+((j-i)*2);  
                }
            }
            count++;
            System.out.println();
         }          
      }
     else
     {
          for(int i=n;i>=1;i--) 
          {
             int trace=count;
             for(int j=n;j>=i;j--)
             {
                 System.out.print(trace+" ");
          
                 if(j%2==0)//even
                {
                    trace = trace+((j-i)*2);  
                }
                else
                {
                    trace = trace +(i*2-1);  
                }   
            }
            count++;
            System.out.println();
         }
     }
  }
}   