class Test
{
  public static  void main(String...arg)
  {
    for(int i=1;i<=13;i++)  
     {
        if(i<7)
        {
          for(int j=1;j<=i;j++)
          {
            System.out.print("* ");
          }
        }
         else if(i>7)
        {
           for(int k=13;k>=i;k--)
           {
              System.out.print("* ");
            }
         }
         else
         {
            System.out.print(" ");
          }
        System.out.println();
    }
  }
 }