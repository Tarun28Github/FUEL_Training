class Test
{
  public static  void main(String...arg)
  {
    for(int i=1;i<=11;i++)  
     {
       if(i<=6)
       {
         for(int k=6;k>i;k--)
         {
             System.out.print(" ");
          }
         for(int j=1;j<=i;j++)
         {
              if(j>1 && j<i)
             {
                System.out.print("  ");
              }
             else
             { 
                 System.out.print("* ");
              }
         }
       }
       else
      {
        for(int m=7;m<=i;m++)
        {
           System.out.print(" ");
         }
        for(int n=11;n>=i;n--)
        { 
           if(n>i && n<11)
           {
              System.out.print("  ");
            }
          else
          {
           System.out.print("* ");
          }
         }
       }
        System.out.println();
    }
  }
 }