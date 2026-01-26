import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer3
{
    public static void main(String A[])throws Exception
    {
        System.out.println("Server is Running....");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting at port number 2100");
        Socket sobj = ssobj.accept();
        System.out.println("Client request arrived and accepted by server");

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());                     // Kan
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());                  // Tond

        int no1 = 0, no2 = 0;

        no1 = diobj.readInt();
        no2 = diobj.readInt();

        int sum = no1 + no2;

        doobj.writeInt(sum);


        sobj.close();
        ssobj.close();
        System.out.println("Server application is terminated");
    }
}