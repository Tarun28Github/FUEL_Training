class Test
{
  public static void main(String...asdg)
  {
    for(int i=1;i<=13;i++)
    {
        for(int j=1;j<=17;j++)
        {
           if((i==5) || (i==13) || (j==17) || ( i>5  && j==1 ) || (i>5 && j==9) || (i==1 && j>4) || ((i>1 && i<5) && (j>1&& j<5) && (i+j==6)) || ((i>1 && i<5) && (j>5&& j<9) && (j-i==4)))
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