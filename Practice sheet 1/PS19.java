class Test
{
  public static  void main(String...arg)
  {
    for(int i=1;i<=9;i++)  
     {
        if(i<=5)
        {
          for(int j=1;j<=i;j++)
          {
            System.out.print("* ");
          }
        }
        else
        {
           for(int k=9;k>=i;k--)
           { 
               System.out.print("* ");
            }
        } 
        System.out.println();
    }
  }
 }