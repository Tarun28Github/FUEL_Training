import java.util.*;
class Test
{
  public static void main(String...arg)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of array");
     int n=sc.nextInt();
     int[] a=new int[n];
     System.out.println("enter array element:"); 
     for(int i=0;i<n;i++) 
     {
         a[i]=sc.nextInt();
      }
      mergsort(a,start,end);
      for(int i=0;i<n;i++)
      {
        System.out.println(a[i]);
       }   
     }
     public static void mergesort(int[]  a, int start, int end)
     {
       if(start<end)
       {
          int mid=(start+end)/2;
          mergesort(a,start,mid);
          mergesort(a,mid+1,end);
         sort(a,start,end,mid); 
        }     
      }
      public static void sort(int[] a,start,end,mid)
      {
            