class Test
{
  public static  void main(String...arg)
  {
    for(int i=1;i<=10;i++)  
     {
       if(i<=5)
       {
         for(int k=1;k<=i;k++)
         { 
           System.out.print(" ");   
         }
         for(int j=5;j>=i;j--)
         {
            System.out.print("* ");
         }
       }
       else
      {
          for(int l=10;l>=i;l--)
          {
              System.out.print(" ");
          }
          for(int m=6;m<=i;m++)
           {
              System.out.print("* ");
           }
       }
         System.out.println();
    }
  }
 }