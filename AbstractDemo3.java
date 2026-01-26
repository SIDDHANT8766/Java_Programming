abstract class Base
{
   public int i,j;
   public int Addition(int a,int b)
   {
    return a+b;
   } 
   abstract public int Substraction(int a,int b);
  
   

}
class Derived extends Base          // Errors
{
    public int Substraction(int a,int b)
    {
        return a-b;
    }
    public int Multiplication(int a,int b)
    {
        return a*b;
    }


}

class AbstractDemo3
{
    public static void main(String S[])
    { 
        
        Base bp = new Derived();            // Upcasting
        int iRet =0;
        
        iRet = bp.Addition(11,10);
        System.out.println(iRet);

        iRet = bp.Substraction(11,10);
        System.out.println(iRet);

        //siRet = bp.Multiplication(11,10);       // Error
    }
}