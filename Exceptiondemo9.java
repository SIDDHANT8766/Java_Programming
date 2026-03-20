       import java.util.*;
class Exceptiondemo9 {

    public static void main(String Arr[])
    {   
        

        Scanner sobj=new Scanner (System.in);
        
         int arr[] = {10,20,30,40,50};
         int iIndex=0,iData=0;

        System.out.println("enter the index number");
        iIndex=sobj.nextInt();

        iData=arr[iIndex];        //exception prone code(Error can appears here)
        System.out.println("element at that index is "+iData);
    }
}
