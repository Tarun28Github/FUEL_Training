class Test
{
  public static void main(String...asdg)
  {
    for(int i=0;i<6;i++)
    {
        for(int j=0;j<=6;j++)
        {
           if( (i==0 && j%3!=0) || ( i==1 && j%3==0) || (i>1 && i-j==2) || (i>1 && i+j==8)  )
          {
              System.out.print("*");
          }
           else
          {
              System.out.print(" "); 
           }
         }
       System.out.println();
    }
   }
 }