class Test
{
  public static  void main(String...arg)
  {
    char a='A';
    for(int i=1;i<=7;i++)  
     {
         for(int j=1;j<=i;j++)
         {
            System.out.print(a+" ");
            a++;
         }
        System.out.println();
    }
  }
 }