import java.sql.*;


class MarvellousJDBC
{
    public static void main(String A[])
    {
        try
        {
            // Step 1 :- Load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2 :- Connect the Driver with Database
            Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppa53","root","");

            // Step 3 :- create ststment class object
            Statement sobj = cobj.createStatement();

            // Step 4 :- Execute the Query
            ResultSet robj = sobj.executeQuery("select * from student where city='pune' ");

            // Step 5 :- Display the result
            while(robj.next())
            {
                System.out.println("Roll no :"+ robj.getInt("Rno"));
                System.out.println("Name :"+ robj.getString("Name"));
                System.out.println("City :"+ robj.getString("City"));
                System.out.println("Marks :"+ robj.getInt("Marks"));
            }

            robj.close();
            robj.close();
            robj.close();
            robj.close();

        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurde"+eobj);
        }
    }
}