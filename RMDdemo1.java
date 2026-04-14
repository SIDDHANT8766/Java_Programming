class Base
{
   public int i,j;

}
class Derived extends Base
{
   public int x;

}

class RMDdemo1
{
    public static void main(String S[])
    { 
        Base bp1 = new Base();           // No casting
        Derived dp1 = new Derived();     // No casting
        Base bp2 = new Derived();        // Up castings
        Derived dp2 = new Base();        // Down casting  (Error)


        
    }
}