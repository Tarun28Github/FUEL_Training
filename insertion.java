class Test
{
 public static void main(String...dsg)
  {
     int[] a={3,2,5,1,4};
    for(int i=0;i<4;i++)
    {
       for(int j=i+1;j>0;j--)
       {
          if(a[j]<a[j-1])
         { 
             int temp=a[j];
              a[j]=a[j-1];
              a[j-1]=temp;
          }
         else
        {
           break;
         }
       }
     }
      for(int i=0;i<5;i++)
      {
         System.out.println(a[i]);
       }    
     }
   }   
            