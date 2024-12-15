class Test
{
  public static void main(String...arg)
  {
      for(int i=1;i<=6;i++)
        {
          for(int j=1;j<=5;j++)
          { 
            if(i%2!=0)
              {
               System.out.print(j);
               }
              else
                {
               System.out.print("*");
               }
           }
            System.out.println();
          }
     }
}
         