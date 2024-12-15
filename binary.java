import java.util.*;
class Test
{
  public static void main(String...arg)
  {
     Scanner sc=new Scanner(System.in);
     int[] a=new int[10];
     System.out.println("Enter the array element");
     for(int i=0; i<10; i++)
     {
         a[i] = sc.nextInt();    
      }
      System.out.println("Enter the element you want to find:");
     int f= sc.nextInt();
     int start=0;
     int end=9;

    boolean b = false;
    while(start <= end)
    {
         int mid=(start+end)/2;    
        if(a[mid]==f)
        {
           b=true;
            System.out.println("element found at:"+(mid+1));
            break;
        }
       else if( a[mid] > f)
        {
             end =mid-1;
        }
      else
       {
            start= mid+1;
       }
    }
      if(b==false)
      {
           System.out.println("element not found:");
       }
  }
}      
        
       
     