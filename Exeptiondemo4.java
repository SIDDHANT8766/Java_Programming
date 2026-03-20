
import java.util.*;

class Exeptiondemo4
{
    public static void main(String S[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0;
        int iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter first no:");
        iNo1=sobj.nextInt();

        System.out.println(("Enter second no:"));
        iNo2=sobj.nextInt();
        
        try
        {
            System.out.println("Inside try Block");
            iAns= iNo1 /iNo2;
        }

        catch(ArithmeticException aobj)
        {
            System.out.println("Inside catch Block");
            System.out.println(aobj);   
        }

        System.out.println("Division is:"+iAns);
       
        
    }
}