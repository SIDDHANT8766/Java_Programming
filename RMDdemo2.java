class Base
{
   public int i,j;
   public void fun()
   {
     System.out.println("Inside Base fun");
   }
   public void gun()
   {
     System.out.println("Inside Base gun");
   }
   public void sun()
   {
     System.out.println("Inside Base sun");
   }
   public void bun()
   {
     System.out.println("Inside Base bun");
   }

}
class Derived extends Base
{
   public int x;
   public void gun()
   {
      System.out.println("Inside Derived gun");
   }
   public void sun()
   {
      System.out.println("Inside Derived sun");
   }
   public void run()
   {
     System.out.println("Inside Derived run");
   }
   public void mun()
   {
     System.out.println("Inside Derived mun");
   }

}

class RMDdemo2
{
    public static void main(String S[])
    { 
        //Base bp1 = new Base();           // No casting
        //Derived dp1 = new Derived();     // No casting
        Base bp = new Derived();        // Up castings
        //Derived dp2 = new Base();        // Down casting  (Error)
       
       bp.fun();              // Base fun
       bp.gun();              // Derived gun  ( intead of Base gun)(due to java)
       bp.sun();              //Derived sun   --------------//--------------
       //bp.run();              // Error
       //bp.mun();              // Error
       bp.bun();              // Base buns
          
        
    }
}