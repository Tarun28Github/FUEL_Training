//program to find diff of pos in array
import java.util.*; 
class Test
{
  public static void main(String...arg)
  {
   int nd=8;
    Scanner sc=new Scanner(System.in);
    int[] a=new int[8];

    System.out.println("enter array element");
    for(int i=0;i<8;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("enter the value of x and y:");
    int x=sc.nextInt();
    int y=sc.nextInt();

    for(int i=0;i<8;i++)
    {
      if(a[i]==x)
        {
             for(int j=i+1;j<8;j++)
            {
                 if(a[j]==y)
                {
                 int   d=j-i;
                  if(d<nd)
                    {
                         nd=d;
                     }
                  break;
                 }
            }                    
         }
        if(a[i]==y)
        {
            for(int j=i+1;j<8;j++)
            {
                 if(a[j]==x)
                {
                   int  d=j-i;
                    if(d<nd)
                    {
                         nd=d;
                     }
                   break;
                 }
            }     
        }
      if(nd==1)
        {
            break;
         }  
    }
    if(nd==8)
        {
             System.out.println("Distance not found");
         }
     else{
          System.out.println(nd);
          }
   }
}