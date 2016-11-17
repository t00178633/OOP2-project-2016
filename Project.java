//Project.java
/*Java Project*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener
{
	JMenu Customers;
	JMenu Parts;
	JMenu Repairs;
	JMenu Exit;
	
	public static void main (String args []) 
	{
		Project mainmenu = new Project ();
		mainmenu.setVisible(true);
		
	}
}