class Test
{
  public static void main(String...asrs)
   {
     for(int i=1;i<=10;i++)
     {
       if(i<=5)
      {
         for(int j=5;j>i;j--)
         {
           System.out.print(" ");
          }
         for(int k=1;k<=i;k++)
         {
            System.out.print("*");
         }
        int count=0;
         for(int l=1;l<=i;l++)
        { 
           System.out.print(i+count);
           count++;
        }
      }
      else
       { 
          for(int x=6;x<i;x++)
         {
             System.out.print(" ");
          }
           int d=5;
          for(int y=10;y>=i;y--)
          {
               System.out.print(d);
               d--;
          }
          int count=i-5;    
          for(int z=10;z>=i;z--)
          {
              System.out.print(count*2-1);
               count++;
           }
        }
       System.out.println();
     }
   }
 }