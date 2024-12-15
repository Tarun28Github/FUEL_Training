class Test
{
   public static void main(String...arg)
   {
      for(int i=0;i<=6;i++)
      {
        for(int j=0;j<=8;j++)
        {
           if((i==3)||(j==4)||(i==0 && j>4)||(i==6 && j<4)||(i<3 && j==0)||(i>3 && j==8))
           {
                System.out.print("* ");
           }
           else
           {
                System.out.print("  ");
            }
       }
       System.out.println();
    }
  }
}