class Test
{
  public static void main(String...arg)
  {
    for(int i=0;i<=5;i++)
    {
       int count=i-1;
        for(int j=0; j<=i*2;j++)
       {
           if(j<=i)
           {
                System.out.print((int)Math.pow(2,j)+" ");            }
            else
            {
              System.out.print((int)Math.pow(2,count)+" ");
             count--;             
             }
        }
        System.out.println();
    }
  }
}