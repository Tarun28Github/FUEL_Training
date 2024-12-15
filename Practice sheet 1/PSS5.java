class Test
{
  public static void main(String...arg)
  {
     for(int i=1;i<=5;i++)
     {
          int count=i;
         for(int j=5;j>=i;j--)
         {
            System.out.print(count*2-1);
            count++;
         }
         System.out.println();
      }
   }
 }