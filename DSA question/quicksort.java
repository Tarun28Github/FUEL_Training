import java.util.*;
class Test
{ 
  public static void main(String...arg)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int n=sc.nextInt();
      int[]  a=  new int[n];
      System.out.println("enter array element:");
      for(int i=0;i<n;i++)
      {
           a[i]=sc.nextInt();
      }
      int start=0;
      int end=n-1;
      quicksort( a, start ,end);
      System.out.println("performing quick sort:");
      for(int i=0;i<n;i++)
     {
          System.out.println(a[i]);
      }
  }
   public static void quicksort(int[] a, int end,int start)
        {
            if(start<end)
              {
                int pos=sort(a, start ,end);
                quicksort(a,start,pos-1);
                quicksort(a,pos+1,end);
              }
        }
     public static int sort(int[] a, int st,int en)
     {
         int start=st;
         int end=en;
         int pivot=start;
         while(start<end) 
        {
          while(a[start]<=a[pivot])
          {
             if(start == end)
              {
                  break;
               }
               else
              {
               start++;
               }
           }
           while(a[end]>a[pivot])
           {
                end--;
            }
           if(start<end)
            {
               int temp=a[start];
               a[start]=a[end];
               a[end]=temp;       
             }
          }
            int temp=a[pivot];
            a[pivot]=a[end];
            a[end]=temp;
            return end;
       
    } 
}
  