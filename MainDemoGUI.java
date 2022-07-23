import java.awt.*;
import java.swing.*;
 class MainDemoGUI
{
	public static void main(String args[])
{
	JFrame frm=new JFrame();
	Container con=frm.getContentPane();
	FlowLayout flw=new FlowLayout();
	con.setLayout(flw);
	JButton btn=new JButton("Click Me");
	con.add(btn);
	frm.setSize(300,400);
	frm.setVisible(true);
	}
}