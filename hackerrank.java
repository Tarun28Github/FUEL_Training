import java.util.Scanner;
import java.math.BigDecimal;
class Test
{
   public static void main(String...khjadnf)
  {

    Scanner sc = new Scanner(System.in);
    String a = new String(sc.next());
    String b = new String(sc.next());
     
    BigDecimal c = new BigDecimal(a);
    BigDecimal d = new BigDecimal(b);
    
     
   int i = a.compareTo(b);
   System.out.println(i);
  }
}