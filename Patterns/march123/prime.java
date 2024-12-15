import java.util.*;
class Test
{
   public static void main(String...ardf)
   {
       int num=50;
        for(int i=2;i<=num;i++)
         {
            int flag=0;
            for(int j=2;j<i;j++)
           {
             if(i%j==0)
              { 
                 flag=0;
                  break; 
              }
               else
                  { 
                    flag=1;
                  }
           }
           if(flag==1)
           {     
               System.out.println(i);
            }
         }
    }
}    