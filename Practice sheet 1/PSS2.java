class Test
{
 public static void main(String...arf)
  {   
      for(int i=1;i<=7;i++)
    {
     if(i<=4)
     {
         for(int j=7;j>=i*2-1;j--)
         {
            System.out.print("  ");
         }
         for(int k=i;k>=1;k--)
         {
            System.out.print(k+" ");
          }
          if(i>1)
          {
            for(int l=1;l<=(i-1)*2-1;l++)
            {
             System.out.print("  ");
            } 
            for(int m=1;m<=i;m++)
           {
            System.out.print(m+" ");
            }
          }
      }
       else
       {
           int count=(i-4)+1;
           for(int n=1;n<=count*2-1;n++)
           {
                System.out.print("  ");
            } 
           for(int x=7-i+1;x>=1;x--)
           {
               System.out.print(x+" ");
            }
          if(i<7)
         {
           for(int y=1;y<=(7-i)*2-1;y++)
           {
               System.out.print("  ");
            }
            for(int z=1;z<=7-i+1;z++)
           {
                System.out.print(z+" ");
            }
          }
         }
         System.out.println();
      }
   }
 }