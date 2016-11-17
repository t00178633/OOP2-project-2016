//Project.java
/*Java Project*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

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
	
	public Project()
	{
		JLabel opening;
	    Date now;
     	now = new Date();
        SimpleDateFormat today = new SimpleDateFormat();
		
		setTitle("Garage Repairs");
		setSize(300,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container mainbackground = getmainbackground();
        mainbackground.setBackground (Color.gray);
        mainbackground.setLayout(null);
        
        createCustomers();
        createParts();
        createRepairs();
        createExit();
        
        JMenuBar menuTop = new JMenuBar();
        setJMenuBar(menuTop);
        menuTop.setBackground(Color.orange);
        menuTop.add(Customers);
        menuTop.add(Parts);
        menuTop.add(Repairs);
        menuTop.add(Exit);
        
        opening = new JLabel("Hello, Welcome to Garage Repairs." + today.format(now));
        opening.setSize(250, 50); 
        mainbackground.add(opening);
	}
	
	  
}