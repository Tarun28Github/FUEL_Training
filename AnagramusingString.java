import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        boolean flag = false;
        
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        StringBuffer C = new StringBuffer();
        StringBuffer D = new StringBuffer();
        String E= new String();
        String F= new String();
        char[] Aarr = A.toCharArray();
        char[] Barr = B.toCharArray();
        
        if(Aarr.length == Barr.length)
        {
            for(int i=0 ; i<Aarr.length-1 ;i++)
            {
                for(int j=i+1 ; j<Aarr.length ;j++)
                {
                    int Acomp = Character.compare(Aarr[i], Aarr[j]);
                    int Bcomp = Character.compare(Barr[i], Barr[j]);
                    if(Acomp>0)
                    {
                        char temp = Aarr[i];
                        Aarr[i]=Aarr[j];
                        Aarr[j]=temp;
                    }
                    
                    if(Bcomp>0)
                    {
                        char temp = Barr[i];
                        Barr[i]=Barr[j];
                        Barr[j]=temp;
                    }
                }
            }
            
            for(int k=0;k<Aarr.length;k++)
            {
               C.append(Character.toString(Aarr[k]));
               D.append(Character.toString(Barr[k]));  
            }
            E= C.toString();
            F= D.toString(); 
             
            
            flag = E.equals(F);
            
        }
        
        
        return flag;
        
        
        // Complete the function
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}