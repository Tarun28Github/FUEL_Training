import java.util.Scanner;
class Test
{
  public static void main(String...fajs)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter array size");
    int n=sc.nextInt();
    int[] a=new int[n];
    System.out.println("enter arrray element");
    for(int i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
     }
   int jump=0;
   int temp=0;
    int count=0;
    while(temp<n)
    {   
        if(a[jump]!=0)
        {
            jump=a[jump];
            temp=temp+jump;
        }
        else
        {
              System.out.print("-1");
              break;
         }
         count++;
     }
       System.out.println("no. of jump are:"+count);
  }
}

          
   
 
    