import java.util.*;
class Exceptiondemo10 
{

    public static void main(String Arr[])
    {   
        

        Scanner sobj=new Scanner (System.in);
        
         int arr[] = {10,20,30,40,50};
         int iIndex=0,iData=0;

        System.out.println("enter the index number");
        iIndex=sobj.nextInt();

        try{
            System.out.println("inside try block");
            iData=arr[iIndex];        //exception prone code
        }
        catch(Exception eobj)
        {
            System.out.println("inside catch block");
            System.out.println(eobj);
        }
        finally{
            System.out.println("inside finally block");
        }
        
        System.out.println("element at that index is "+iData);
    }
}
