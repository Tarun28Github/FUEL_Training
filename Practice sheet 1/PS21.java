class Test
{
  public static  void main(String...arg)
  {
    for(int i=1;i<=8;i++)  
     {
        for(int k=8;k>=i;k--)
       {
           System.out.print("*");
        }
         for(int j=1;j<i;j++)
         {
            System.out.print("__");
         }
         for(int m=8;m>=i;m--)
         {
            System.out.print("*");
          }
        System.out.println();
    }
  }
 }