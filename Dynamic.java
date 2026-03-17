import java.util.Scanner;

class Dynamic
{

    public static void main(String Sid[])
    {
      Scanner sobj= new Scanner(System.in);

      int length = 0;
      int Arr [];

      System.out.println("Enter the no of elements :");
      
      length = sobj.nextInt();

      Arr = new int[length];

      if(Arr == null)
    {
        System.out.println("unablr to allocate memmory :");
    }
    else
    {
        System.out.println("Memory gets succesfully allocate :");

    }
        
    Arr = null;
    System.gc();
    }

    
}