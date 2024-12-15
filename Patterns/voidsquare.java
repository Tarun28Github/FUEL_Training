class Test
{  
   public static void main(String...arg)
   {
      for(int i=1;i<=4;i++)
      {
         for(int j=1;j<=4;j++)
        {
         if((i==1) ||(i==4) ||(j==1)||(j==4))
         {
           if(i>=j)
          { 
            System.out.print(i-j+1);    
          }
          else
          {
             System.out.print(j-i+1);
          }
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

