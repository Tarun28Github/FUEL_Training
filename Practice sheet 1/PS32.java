class Test
{
  public static void main(String...arg)
  {
    for(int i=1;i<=7;i++)
    {
        int c=1;
        for(int j=1;j<=i;j++)
       {
            if(c>0)
            {
                 System.out.print(c+" ");
                 c=c*(i-j)/j;
             }
       }
        System.out.println();
    }
 }
}