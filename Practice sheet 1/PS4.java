class Test
{
  public static  void main(String...arg)
  {
    for(int i=0;i<5;i++)  
     {
        int count=0;
         for(int j=5;j>=i;j--)
         {
            System.out.print(count);
            count++;
         }
        System.out.println();
    }
  }
 }