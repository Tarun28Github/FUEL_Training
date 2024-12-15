class Test
{
   public static void main(String...asef)
   {
     for(int i=0;i<5;i++)
     {
         for(int j=0;j<5;j++)
         {
            if(i==j)
            {
               System.out.print("x");
             }
            else if((i+j)==4)
             {
                 System.out.print("x");
             }
             else
             {
                System.out.print(0);
             }
           }
          System.out.println();
       }
    }
 }