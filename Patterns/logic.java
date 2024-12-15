/* pattern problem
1
2 1
4 2 1
8 4 2 1 
.....
 */
class Test
{
  public static void main(String...asdf)
  {
     
    for(int i=0;i<8;i++)
    {
     int a=i;
      for(int j=0;j<=i;j++)
      {
         System.out.print((int)Math.pow(2,a)+" ");
         a--;
       }
      System.out.println();
    }
  }
}
     