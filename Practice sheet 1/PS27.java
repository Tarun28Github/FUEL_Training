class Test
{
   public static void main(String...adrdg)
   {
      for(int i=1;i<=12;i++)
      {
         if(i<=6)
         {
            for(int j=6;j>i;j--)
            {
                System.out.print(" ");
             }
             for(int k=1;k<=i*2-1;k++)
             {
                 System.out.print("*");
             }
         }
         else
         {
             for(int l=1;l<=7;l++) 
             {
                 if(l<=4)
                 {
                    System.out.print(" ");
                 }
                else
                 {
                    System.out.print("*");
                  }
             }
          }
         System.out.println();
      }
   }
 }
      