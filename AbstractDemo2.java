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

}

class AbstractDemo2s
{
    public static void main(String S[])
    { 
        
        Base bp = new Base();    
    }
}