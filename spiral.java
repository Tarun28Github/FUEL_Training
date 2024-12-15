class Test
{
  public static void main(String...asdfj)
  {
    int[][]  a = new int[5][5];
    int count=1;
    int dir=1;
    int k,m;
    int rs=0,cs=0,re=4,ce=4;
   while(rs<=re && cs<=ce)
   {
      if(dir==1)
      {
          k=rs;
          for(m=cs;m<=ce;m++)
          {
              a[k][m]=count;
              count++;
          }
          dir=2;
          rs++;      
      }
       if(dir==2)
      {
          m=ce;
          for(k=rs;k<=re;k++)
          {
              a[k][m]=count;
              count++;
          }
          dir=3;
          ce--;  
      }
      if(dir==3)
      {
       k=re;
          for(m=ce;m>=cs; m--)
          {
             a[k][m]=count;
              count++;
          }
          dir=4;
          re--;  
      }
      if(dir==4)
      {
        m=cs;
          for(k=re;k>=rs;k--)
          {
             a[k][m]=count;
              count++;
          }
          dir=1;
          cs++;  
      }    
   }
      for(int i=0;i<5;i++)
     {
      for(int j=0;j<5;j++)
       {
         System.out.print(a[i][j]+" ");
       }
       System.out.println();
     }   
 }
} 
          