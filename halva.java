class Test
{ 
  public static void main(String...fkaj)
   {
     int count=1;
     for(int i=5;i>=1;i--) 
     {
        int trace=count;
        for(int j=5;j>=i;j--)
        {
           System.out.print(trace+" ");
          
           if(j%2==0)//even
           {
              trace = trace+((j-i)*2);  
           }
           else
           {
                trace = trace +(i*2-1);  
           }
         
        }
        count++;
        System.out.println();
     }
  }
}   