import java.util.*;
class Test
{
  public static  void main(String...arg)
   {
    int mid=0,start=0,end=4;
     Scanner sc=new Scanner(System.in);
     int[]  a=new int[5];
     for(int i=0;i<5;i++)
     {
       a[i]=sc.nextInt();
     }
      System.out.println("enter the value u want to find:");
     int f=sc.nextInt();
     int flag=0;
    while(start<=end)
    {
        mid= (start+end)/2;
        if(a[mid]==f)
        {
          System.out.println("element found at pos: "+(mid+1));
         flag=1;
         break;
         }
         else if(f>a[mid])
           {
             start=mid+1;
            }
         else
           {
              end=mid-1;
            }
       }
      if(flag!=1)
        {
           System.out.println("element not found");
         }
    }
}