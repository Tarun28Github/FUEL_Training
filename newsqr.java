class Test
{
  public static void main(String...arg)
  {
     int n=3 ,k=5;
     for(int i=1;i<=n*2-1;i++)
     {
        for(int j=1;j<=n*2-1;j++)
        {
           if(i>j)
           {
              if(i!=k)
              {
                System.out.print();
               }
               else
               {
                 System.out.print(k+n-i);
                }  
            }
            if(i<j)
            {
               System.out.print(0);
             }
             if(i==j)
              {
                  if(i<=n)
                 { 
                    System.out.print(n-i+1);
                 }
                  else
                 {
                    System.out.print(n+i-k);
                 }
               }
            }
           System.out.println();
       }
    }
}
           