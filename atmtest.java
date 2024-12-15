abstract class Atm
{
       Atm( int amount)
       {
             System.out.println(amount);
        }
 }
class Test extends Atm
{
  static   int arr[] = {100,100};
      Test(int amount)
      {
           super(amount);
      }
       
     public static void main(String...adhf)
     {
           Test t= new Test(arr[0]);
      }
 }