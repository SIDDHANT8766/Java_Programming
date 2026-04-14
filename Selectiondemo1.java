import java.util.Scanner;

class Selectiondemo1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;


        System.out.println("Enter your age :");
        iNo = sobj.nextInt();
        

        if(iNo >= 18)
        {
            System.out.println("you can vote");
        }

        else
        {
            System.out.println("you cant vote");

        }
        
    }
}