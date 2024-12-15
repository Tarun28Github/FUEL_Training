class Test
{
  public static  void main(String...args)
  {
    for(int i=1;i<=8;i++)
     {
         int exp=i-1;
         for(int j=1;j<=i;j++)
         {
            System.out.print((int)Math.pow(2,exp)+" ");
              exp--;
         }
       System.out.println();
    }
  }
}