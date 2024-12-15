class Test
{
  public static void main(String...arg)
  {
     for(int i=1;i<=5;i++)
     {
         for(int j=5;j>=i;j--)
         {
              System.out.print(" ");
         }
         for(int k=1;k<=i*2-1;k++)
         {
              if((i>1 && i<5) && (k>1 && k<i*2-1) )
              {
                  System.out.print(" ");
               }
               else
               {
                  System.out.print("*");
               }
          }
          System.out.println();  
      }
   }
}
          