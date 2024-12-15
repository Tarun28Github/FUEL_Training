class Test
{
  public static  void main(String...arg)
  {
    for(int i=1;i<=6;i++)  
     {
         for(int k=1;k<i;k++)
         {
             System.out.print(" ");
          }
         for(int j=6;j>=i;j--)
         {
            System.out.print("* ");
         }
        System.out.println();
    }
  }
 }