class Test
{
  public static void main(String...lkvnd)
  {
     int[][] a= new int[9][13];
     for(int i=0;i<9;i++)
     {
       for(int j=0;j<13;j++)
       {
          if((i==2)||((i<3 || j<7)&&(i-j==2))||((i>1||(j>5))&&(i+j==14))||(i==6)||((i<7||j<7)&&(i+j==6))||((i<7||j>5)&&(j-i==6)))
         {
              System.out.print("* ");  
          }
          else
          {
             System.out.print("  ");
           }
        }
          System.out.println();
     }
     /*for(int k=1;k<=9;k++)
     {
        for(int l=1;l<=13;l++)
        {
            System.out.print(a[k][l]);
        }
        System.out.println(); 
      }*/
    }
 }     
