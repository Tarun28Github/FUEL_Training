/* pattern problem
    1
    32
    654
    10987 
*/
class Test
{
   public static void main(String...asfaj)
   {
      int count=0;
      for(int i=1;i<5;i++)
      {
          count=count+i;
         for(int j=0;j<i;j++)
         {
          System.out.print(count-j);  
         }
         System.out.println();
      }
   }
}
    
             