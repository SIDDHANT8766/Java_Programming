
class Demo
{
 public int i;                       // Instance variable
 static public int j;            // Class variable

 static                       // StaticBlock
 {
    System.out.println("Inside static block");
    j = 21;                       
 }

 public Demo()
 {
    System.out.println("Inside Constructor");
    this.i=11;

 }

}
class Blocks
{
    public static void main(String S[])
    {
      System.out.println("Inside main");

      Demo dobj1 = new Demo();
      Demo dobj2 = new Demo();
      Demo dobj3 = new Demo();
    }
}