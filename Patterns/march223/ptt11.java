class Test
{
  public static void main(String...arg)
  {
   int count=0;
    for(int i=1;i<5;i++)
     {
      count+=i;
     int temp=count;
       for(int j=1;j<=i;j++)
       {  
         System.out.print(count);
         count--;
        }
        System.out.println();
      }
   }
 }