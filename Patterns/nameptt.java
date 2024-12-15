//Program to print my name pattern
class Test
{
  public static void main(String...arg)
  {
    for(int i=1;i<=5;i++)
     {
        for(int j=1;j<20;j++)
        {
          if( ( (j==1 | j==6 |j==11 |j==16) && (i>=1))|((i==1 |i==3) &&(j>1 && j<5)) | ((i==5) && ((j>6 && j<10) | (j>11 && j<15) | (j>16 && j<20))) | ((j==9)&& (i>=1 && i<5)) | ((i==1 | i== 3) && (j>11 && j<15)) )
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