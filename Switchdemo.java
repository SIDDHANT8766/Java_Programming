import java.util.Scanner;

class Switchdemo
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        int iStd = 0;

        System.out.println("Enter your standard :");
        iStd = sobj.nextInt();

        switch(iStd)
        {
            case 1:
               System.out.println("exam at 9");
               break;

            case 2:
               System.out.println("exam at 9");
               break;
               
            case 3:
               System.out.println("exam at 9");
               break;

            case 4:
               System.out.println("exam at 9");
               break;

            default:
               System.out.println("Invalid Standard");

        }



        
    }
}