abstract class Base
{
   public int i,j;
   public int Addition(int a,int b)
   {
    return a+b;
   } 
   abstract public int Substraction(int a,int b);
  
   

}


class AbstractDemo1
{
    public static void main(String S[])
    { 
        
        Base bp = new Base();       // Nocasting  (Error \\ cannot create object)
    }
}