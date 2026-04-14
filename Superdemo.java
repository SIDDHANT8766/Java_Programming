class Hello
{
    public int i;

    public Hello(int no)
    {
        System.out.println("Inside Hello Constructor");
        this.i=no+1;
    }

    public void Display()
    {
        System.out.println("Inside Hello Display");
    }

}
class Demo extends Hello
{
    public int i;
    public Demo(int a)
    {
        super(a);            // First use
        System.out.println("Inside Demo constructor");
        this.i=a;              
    }

    public void Display()
    {
        int i =0;

        System.out.println("Inside Display"+i);             //0
        System.out.println("Inside Display"+this.i);      // 50
        System.out.println("Inside Display"+super.i);     //51          //Second use
        
        super.Display();        // Third use
    }

}
class Superdemo
{
    public static void main(String A[])
    {
       Demo dobj = new Demo(51);
       dobj.Display();
          
    }
}