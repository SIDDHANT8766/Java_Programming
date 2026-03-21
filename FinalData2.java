class Demo
{
   public int i = 11;                      //error
   final public int j = 21;               // error cant allowed
   
}
class FinalData1
{
    public static void main(String S[])
    {
        Demo dobj = new Demo();
        
        System.out.println(dobj.i);
        System.out.println(dobj.j);

        dobj.i++;
        //dobj.j++;                            // Error
    }
}