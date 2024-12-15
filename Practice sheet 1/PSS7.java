class Test
{
  public static void main(String...kjpvn)
  {
      for(int i=1;i<=5;i++)
      {
         int trace=i;
         int count=4;
         for(int j=1;j<=i;j++)
        {
           System.out.print(trace+" ");
           trace = trace + count ;
           count--;
         }
         System.out.println();
      }
   }
}
            