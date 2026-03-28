import java.awt.event.*;
import javax.swing.*;

class MarvellousLogin implements ActionListener
{
    // Characteristics
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JPasswordField pobj;
    JLabel UserLable, PassLable, ResultJLable;
    

    public MarvellousLogin(String title, int width, int height)
    {
        fobj = new JFrame(title);
        fobj.setSize(width,height);

        UserLable = new JLabel("User Name");
        UserLable.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(150,50,150,30);

        PassLable = new JLabel("Password");
        PassLable.setBounds(50,100,100,30);

        pobj = new JPasswordField();
        pobj.setBounds(150,100,150,30);

        bobj = new JButton("SUBMIT");
        bobj.setBounds(150,150,100,30);

        ResultJLable = new JLabel("");
        ResultJLable.setBounds(100,150,300,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(UserLable);
        fobj.add(PassLable);
        fobj.add(ResultJLable);

        bobj.addActionListener(this); 
        
        fobj.setLayout(null);
        fobj.setSize(width, height);


        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {
       ResultJLable.setText("Button clicked...");
    }


}
class LoginFrame3
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Login",500,300);
        
    }

}