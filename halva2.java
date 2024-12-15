class Test
{
  public static void main(String...arg)
  {
    int[][] a= new int[5][];
    int count=1; 
    for(int i=0;i<5;i++)
    {
       a[i]= new int[i+1];
     }
    int rs=0,re=4,dir=1;
    while(rs<=re)
    {
      if(dir==1)
      { 
        int j=rs;
        for(int i=rs;i<=re;i++)
        {
             a[i][j]=count;
             count++;
        }
        dir=2;
        rs++;
      }
      if(dir==2)
      {
          int j=rs;
          for(int i=re;i>=rs;i--)
          {
              a[i][j]= count;
              count++;
          }
          dir=1;
          rs++;
       } 
    } 
     for(int i=0;i<5;i++)
     {
         for(int j=0;j<=i;j++)
         {
              System.out.print(a[i][j]+" ");
         }
         System.out.println();
     }  
   }
 }
       
 