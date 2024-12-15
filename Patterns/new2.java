/* pattern problem
****************
*******__******
******____******
*/
class Test
{
  public static void main(String...adsf)
  {
    for(int i=0;i<8;i++)
    {
      for(int j=8;j>i;j--)
      {
         System.out.print("*");
       }
       for(int s=0;s<i*2;s++)
       {
          System.out.print("_");
        }
       for(int k=i;k<8;k++)
       {
          System.out.print("*");
        }      
      System.out.println();    
    }
  }
}
       